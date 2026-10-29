            package io.flutter.embedding.engine.renderer;

            import android.graphics.Bitmap;
            import android.graphics.Rect;
            import android.graphics.SurfaceTexture;
            import android.media.Image;
            import android.media.ImageReader;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.Surface;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.view.TextureRegistry;
            import java.io.IOException;
            import java.lang.ref.WeakReference;
            import java.nio.ByteBuffer;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.AbstractC2481y0;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 45 */    public class FlutterRenderer implements TextureRegistry {
                private static final String TAG = "FlutterRenderer";
                public static boolean debugDisableSurfaceClear;
                public static boolean debugForceSurfaceProducerGlTextures;
                private final FlutterJNI flutterJNI;
                private final FlutterUiDisplayListener flutterUiDisplayListener;
                private Surface surface;
                private final AtomicLong nextTextureId = new AtomicLong(0);
                private boolean isDisplayingFlutterUi = false;
                private final Handler handler = new Handler();
                private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();
                private final List<ImageReaderSurfaceProducer> imageReaderProducers = new ArrayList();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class DisplayFeature {
                    public final Rect bounds;
                    public final DisplayFeatureState state;
                    public final DisplayFeatureType type;

                    public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
/* 4 */                 this.bounds = rect;
/* 6 */                 this.type = displayFeatureType;
/* 8 */                 this.state = displayFeatureState;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum DisplayFeatureState {
                    UNKNOWN(0),
                    POSTURE_FLAT(1),
                    POSTURE_HALF_OPENED(2);

                    public final int encodedValue;

                    DisplayFeatureState(int i) {
/* 4 */                 this.encodedValue = i;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum DisplayFeatureType {
                    UNKNOWN(0),
                    FOLD(1),
                    HINGE(2),
                    CUTOUT(3);

                    public final int encodedValue;

                    DisplayFeatureType(int i) {
/* 4 */                 this.encodedValue = i;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener {
                    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
                    private static final int MAX_DEQUEUED_IMAGES = 2;
                    private static final int MAX_IMAGES = 6;
                    private static final String TAG = "ImageReaderSurfaceProducer";
                    private static final boolean VERBOSE_LOGS = false;
                    private static final boolean trimOnMemoryPressure = true;

                    /* JADX INFO: renamed from: id */
                    private final long f9748id;
                    private boolean released;
                    private boolean ignoringFence = false;
                    private int requestedWidth = 1;
                    private int requestedHeight = 1;
                    private boolean createNewReader = true;
                    boolean notifiedDestroy = false;
                    private long lastDequeueTime = 0;
                    private long lastQueueTime = 0;
                    private long lastScheduleTime = 0;
                    private int numTrims = 0;
                    private final Object lock = new Object();
                    private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque<>();
                    private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap<>();
                    private ArrayList<PerImage> lastDequeuedImage = new ArrayList<>();
                    private PerImageReader lastReaderDequeuedFrom = null;
                    TextureRegistry.SurfaceProducer.Callback callback = null;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class PerImage {
                        public final Image image;
                        public final long queuedTime;

                        public PerImage(Image image, long j) {
/* 6 */                     this.image = image;
/* 8 */                     this.queuedTime = j;
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class PerImageReader {
                        public final ImageReader reader;
                        private final ArrayDeque<PerImage> imageQueue = new ArrayDeque<>();
                        private boolean closed = false;

                        public PerImageReader(ImageReader imageReader) {
/* 16 */                    this.reader = imageReader;
/* 32 */                    imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.b
                                @Override // android.media.ImageReader.OnImageAvailableListener
                                public final void onImageAvailable(ImageReader imageReader2) {
/* 1 */                             this.f9755a.lambda$new$0(imageReader2);
                                }
                            }, new Handler(Looper.getMainLooper()));
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public /* synthetic */ void lambda$new$0(ImageReader imageReader) {
                            Image imageAcquireLatestImage;
                            try {
/* 1 */                         imageAcquireLatestImage = imageReader.acquireLatestImage();
                            } catch (IllegalStateException e) {
/* 23 */                        Log.m4585e(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e);
/* 26 */                        imageAcquireLatestImage = null;
                            }
/* 27 */                    if (imageAcquireLatestImage == null) {
/* 29 */                        return;
                            }
/* 36 */                    if (ImageReaderSurfaceProducer.this.released || this.closed) {
/* 49 */                        imageAcquireLatestImage.close();
                            } else {
/* 45 */                        ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                            }
                        }

                        public boolean canPrune() {
                            return this.imageQueue.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
                        }

                        public void close() {
/* 2 */                     this.closed = true;
/* 6 */                     this.reader.close();
/* 11 */                    this.imageQueue.clear();
                        }

                        public PerImage dequeueImage() {
/* 7 */                     if (this.imageQueue.isEmpty()) {
/* 9 */                         return null;
                            }
/* 13 */                    return this.imageQueue.removeFirst();
                        }

                        public boolean imageQueueIsEmpty() {
/* 3 */                     return this.imageQueue.isEmpty();
                        }

                        public PerImage queueImage(Image image) {
/* 3 */                     if (this.closed) {
/* 5 */                         return null;
                            }
/* 15 */                    PerImage perImage = ImageReaderSurfaceProducer.this.new PerImage(image, System.nanoTime());
/* 20 */                    this.imageQueue.add(perImage);
/* 30 */                    while (this.imageQueue.size() > 2) {
/* 42 */                        this.imageQueue.removeFirst().image.close();
                            }
/* 46 */                    return perImage;
                        }
                    }

                    public ImageReaderSurfaceProducer(long j) {
/* 61 */                this.f9748id = j;
                    }

                    private void cleanup() {
                        synchronized (this.lock) {
                            try {
/* 19 */                        for (PerImageReader perImageReader : this.perImageReaders.values()) {
/* 29 */                            if (this.lastReaderDequeuedFrom == perImageReader) {
/* 31 */                                this.lastReaderDequeuedFrom = null;
                                    }
/* 36 */                            perImageReader.close();
                                }
/* 42 */                        this.perImageReaders.clear();
/* 51 */                        if (this.lastDequeuedImage.size() > 0) {
/* 55 */                            Iterator<PerImage> it = this.lastDequeuedImage.iterator();
/* 63 */                            while (it.hasNext()) {
/* 73 */                                it.next().image.close();
                                    }
/* 79 */                            this.lastDequeuedImage.clear();
                                }
/* 82 */                        PerImageReader perImageReader2 = this.lastReaderDequeuedFrom;
/* 84 */                        if (perImageReader2 != null) {
/* 86 */                            perImageReader2.close();
/* 89 */                            this.lastReaderDequeuedFrom = null;
                                }
/* 93 */                        this.imageReaderQueue.clear();
                            } catch (Throwable th) {
/* 99 */                        throw th;
                            }
                        }
                    }

                    private ImageReader createImageReader29() {
/* 8 */                 return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
                    }

                    private ImageReader createImageReader33() {
/* 1 */                 AbstractC2481y0.m10074t();
/* 8 */                 ImageReader.Builder builderM10062h = AbstractC2481y0.m10062h(this.requestedWidth, this.requestedHeight);
/* 2 */                 builderM10062h.setMaxImages(6);
/* 3 */                 builderM10062h.setImageFormat(34);
/* 3 */                 builderM10062h.setUsage(256L);
/* 1 */                 return builderM10062h.build();
                    }

                    private PerImageReader getActiveReader() {
                        synchronized (this.lock) {
                            try {
/* 6 */                         if (!this.createNewReader) {
/* 10 */                            PerImageReader perImageReaderPeekLast = this.imageReaderQueue.peekLast();
/* 26 */                            if (perImageReaderPeekLast.reader.getSurface().isValid()) {
/* 29 */                                return perImageReaderPeekLast;
                                    }
                                }
/* 33 */                        this.createNewReader = false;
/* 39 */                        return getOrCreatePerImageReader(createImageReader());
                            } catch (Throwable th) {
/* 46 */                        throw th;
                            }
                        }
                    }

                    private PerImageReader getOrCreatePerImageReader(ImageReader imageReader) {
/* 3 */                 PerImageReader perImageReader = this.perImageReaders.get(imageReader);
/* 9 */                 if (perImageReader != null) {
/* 25 */                    return perImageReader;
                        }
/* 11 */                PerImageReader perImageReaderCreatePerImageReader = createPerImageReader(imageReader);
/* 17 */                this.perImageReaders.put(imageReader, perImageReaderCreatePerImageReader);
/* 22 */                this.imageReaderQueue.add(perImageReaderCreatePerImageReader);
/* 25 */                return perImageReaderCreatePerImageReader;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$dequeueImage$0() {
/* 3 */                 if (this.released) {
/* 10 */                    return;
                        }
/* 7 */                 FlutterRenderer.this.scheduleEngineFrame();
                    }

                    private void maybeWaitOnFence(Image image) {
/* 1 */                 if (image == null || this.ignoringFence) {
/* 8 */                     return;
                        }
/* 13 */                if (Build.VERSION.SDK_INT >= 33) {
/* 15 */                    waitOnFence(image);
                        } else {
/* 20 */                    this.ignoringFence = true;
/* 26 */                    Log.m4583d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
                        }
                    }

                    private void releaseInternal() {
/* 1 */                 cleanup();
/* 5 */                 this.released = true;
/* 9 */                 FlutterRenderer.this.removeOnTrimMemoryListener(this);
/* 18 */                FlutterRenderer.this.imageReaderProducers.remove(this);
                    }

                    private void waitOnFence(Image image) {
                        try {
/* 1 */                     image.getFence().awaitForever();
                        } catch (IOException unused) {
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.ImageConsumer
                    public Image acquireLatestImage() {
/* 1 */                 PerImage perImageDequeueImage = dequeueImage();
/* 5 */                 if (perImageDequeueImage == null) {
/* 7 */                     return null;
                        }
/* 11 */                maybeWaitOnFence(perImageDequeueImage.image);
/* 14 */                return perImageDequeueImage.image;
                    }

                    public ImageReader createImageReader() {
/* 1 */                 int i = Build.VERSION.SDK_INT;
/* 5 */                 if (i >= 33) {
/* 7 */                     return createImageReader33();
                        }
/* 14 */                if (i >= 29) {
/* 16 */                    return createImageReader29();
                        }
/* 23 */                C1951n4.m6866q("ImageReaderPlatformViewRenderTarget requires API version 29+");
/* 26 */                return null;
                    }

                    public PerImageReader createPerImageReader(ImageReader imageReader) {
/* 3 */                 return new PerImageReader(imageReader);
                    }

                    public double deltaMillis(long j) {
/* 7 */                 return j / 1000000.0d;
                    }

                    public PerImage dequeueImage() {
                        PerImage perImage;
                        int i;
                        boolean z;
                        ArrayList<PerImage> arrayList;
                        synchronized (this.lock) {
                            try {
/* 6 */                         Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
/* 10 */                        perImage = null;
                                while (true) {
/* 15 */                            i = 0;
/* 16 */                            if (!it.hasNext()) {
                                        break;
                                    }
/* 18 */                            PerImageReader next = it.next();
/* 24 */                            PerImage perImageDequeueImage = next.dequeueImage();
/* 28 */                            if (perImageDequeueImage != null) {
                                        while (true) {
/* 34 */                                    int size = this.lastDequeuedImage.size();
/* 38 */                                    arrayList = this.lastDequeuedImage;
/* 41 */                                    if (size <= 2) {
                                                break;
                                            }
/* 51 */                                    arrayList.remove(0).image.close();
                                        }
/* 57 */                                arrayList.add(perImageDequeueImage);
/* 60 */                                this.lastReaderDequeuedFrom = next;
/* 62 */                                perImage = perImageDequeueImage;
                                        break;
                                    }
/* 30 */                            perImage = perImageDequeueImage;
                                }
/* 63 */                        pruneImageReaderQueue();
/* 68 */                        Iterator<PerImageReader> it2 = this.imageReaderQueue.iterator();
                                while (true) {
/* 76 */                            if (!it2.hasNext()) {
/* 92 */                                z = false;
                                        break;
                                    }
/* 88 */                            if (!it2.next().imageQueueIsEmpty()) {
/* 90 */                                z = true;
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
/* 112 */                       throw th;
                            }
                        }
/* 94 */                if (z) {
/* 107 */                   FlutterRenderer.this.handler.post(new RunnableC1067a(this, i));
                        }
/* 110 */               return perImage;
                    }

                    public void disableFenceForTest() {
/* 2 */                 this.ignoringFence = true;
                    }

                    public void finalize() throws Throwable {
                        try {
/* 3 */                     if (this.released) {
/* 8 */                         return;
                            }
/* 9 */                     releaseInternal();
/* 31 */                    FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f9748id, FlutterRenderer.this.flutterJNI));
                        } finally {
/* 39 */                    super.finalize();
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public Surface getForcedNewSurface() {
/* 2 */                 this.createNewReader = true;
/* 4 */                 return getSurface();
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public int getHeight() {
/* 1 */                 return this.requestedHeight;
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public Surface getSurface() {
/* 7 */                 return getActiveReader().reader.getSurface();
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public int getWidth() {
/* 1 */                 return this.requestedWidth;
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public boolean handlesCropAndRotation() {
/* 1 */                 return false;
                    }

                    @Override // io.flutter.view.TextureRegistry.TextureEntry
                    /* JADX INFO: renamed from: id */
                    public long mo4606id() {
/* 1 */                 return this.f9748id;
                    }

                    public int numImageReaders() {
                        int size;
                        synchronized (this.lock) {
/* 6 */                     size = this.imageReaderQueue.size();
                        }
/* 11 */                return size;
                    }

                    public int numImages() {
                        int size;
                        synchronized (this.lock) {
                            try {
/* 6 */                         Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
/* 10 */                        size = 0;
/* 15 */                        while (it.hasNext()) {
/* 31 */                            size += it.next().imageQueue.size();
                                }
                            } catch (Throwable th) {
/* 38 */                        throw th;
                            }
                        }
/* 36 */                return size;
                    }

                    public int numTrims() {
                        int i;
                        synchronized (this.lock) {
/* 4 */                     i = this.numTrims;
                        }
/* 7 */                 return i;
                    }

                    public void onImage(ImageReader imageReader, Image image) {
                        PerImage perImageQueueImage;
                        synchronized (this.lock) {
/* 8 */                     perImageQueueImage = getOrCreatePerImageReader(imageReader).queueImage(image);
                        }
/* 13 */                if (perImageQueueImage == null) {
/* 15 */                    return;
                        }
/* 18 */                FlutterRenderer.this.scheduleEngineFrame();
                    }

                    @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
                    public void onTrimMemory(int i) {
/* 3 */                 if (i < 40) {
/* 5 */                     return;
                        }
                        synchronized (this.lock) {
/* 13 */                    this.numTrims++;
                        }
/* 16 */                TextureRegistry.SurfaceProducer.Callback callback = this.callback;
/* 18 */                if (callback != null) {
/* 20 */                    this.notifiedDestroy = true;
/* 22 */                    callback.onSurfaceCleanup();
                        }
/* 25 */                cleanup();
/* 28 */                this.createNewReader = true;
                    }

                    public int pendingDequeuedImages() {
/* 3 */                 return this.lastDequeuedImage.size();
                    }

                    public void pruneImageReaderQueue() {
                        PerImageReader perImageReaderPeekFirst;
/* 8 */                 while (this.imageReaderQueue.size() > 1 && (perImageReaderPeekFirst = this.imageReaderQueue.peekFirst()) != null && perImageReaderPeekFirst.canPrune()) {
/* 29 */                    this.imageReaderQueue.removeFirst();
/* 36 */                    this.perImageReaders.remove(perImageReaderPeekFirst.reader);
/* 39 */                    perImageReaderPeekFirst.close();
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.TextureEntry
                    public void release() {
/* 3 */                 if (this.released) {
/* 5 */                     return;
                        }
/* 6 */                 releaseInternal();
/* 1 */                 FlutterRenderer.this.unregisterTexture(this.f9748id);
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public void scheduleFrame() {
/* 3 */                 FlutterRenderer.this.scheduleEngineFrame();
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
/* 1 */                 this.callback = callback;
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
                    public void setSize(int i, int i2) {
/* 2 */                 int iMax = Math.max(1, i);
/* 6 */                 int iMax2 = Math.max(1, i2);
/* 12 */                if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
/* 18 */                    return;
                        }
/* 19 */                this.createNewReader = true;
/* 21 */                this.requestedHeight = iMax2;
/* 23 */                this.requestedWidth = iMax;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
                    private static final String TAG = "ImageTextureRegistryEntry";

                    /* JADX INFO: renamed from: id */
                    private final long f9749id;
                    private boolean ignoringFence = false;
                    private Image image;
                    private boolean released;

                    public ImageTextureRegistryEntry(long j) {
/* 9 */                 this.f9749id = j;
                    }

                    private void maybeWaitOnFence(Image image) {
/* 1 */                 if (image == null || this.ignoringFence) {
/* 8 */                     return;
                        }
/* 13 */                if (Build.VERSION.SDK_INT >= 33) {
/* 15 */                    waitOnFence(image);
                        } else {
/* 20 */                    this.ignoringFence = true;
/* 26 */                    Log.m4583d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
                        }
                    }

                    private void waitOnFence(Image image) {
                        try {
/* 1 */                     image.getFence().awaitForever();
                        } catch (IOException unused) {
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.ImageConsumer
                    public Image acquireLatestImage() {
                        Image image;
                        synchronized (this) {
/* 2 */                     image = this.image;
/* 5 */                     this.image = null;
                        }
/* 8 */                 maybeWaitOnFence(image);
/* 11 */                return image;
                    }

                    public void finalize() throws Throwable {
                        try {
/* 3 */                     if (this.released) {
/* 8 */                         return;
                            }
/* 9 */                     Image image = this.image;
/* 11 */                    if (image != null) {
/* 13 */                        image.close();
/* 17 */                        this.image = null;
                            }
/* 23 */                    this.released = true;
/* 44 */                    FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f9749id, FlutterRenderer.this.flutterJNI));
                        } finally {
/* 51 */                    super.finalize();
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.TextureEntry
                    /* JADX INFO: renamed from: id */
                    public long mo4606id() {
/* 1 */                 return this.f9749id;
                    }

                    @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
                    public void pushImage(Image image) {
                        Image image2;
/* 3 */                 if (this.released) {
/* 31 */                    return;
                        }
                        synchronized (this) {
/* 7 */                     image2 = this.image;
/* 9 */                     this.image = image;
                        }
/* 12 */                if (image2 != null) {
/* 18 */                    Log.m4585e(TAG, "Dropping PlatformView Frame");
/* 21 */                    image2.close();
                        }
/* 24 */                if (image != null) {
/* 28 */                    FlutterRenderer.this.scheduleEngineFrame();
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.TextureEntry
                    public void release() {
/* 3 */                 if (this.released) {
/* 5 */                     return;
                        }
/* 7 */                 this.released = true;
/* 9 */                 Image image = this.image;
/* 11 */                if (image != null) {
/* 13 */                    image.close();
/* 17 */                    this.image = null;
                        }
/* 1 */                 FlutterRenderer.this.unregisterTexture(this.f9749id);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {
                    private TextureRegistry.OnFrameConsumedListener frameConsumedListener;

                    /* JADX INFO: renamed from: id */
                    private final long f9750id;
                    private boolean released;
                    private final SurfaceTextureWrapper textureWrapper;
                    private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

                    public SurfaceTextureRegistryEntry(long j, SurfaceTexture surfaceTexture) {
/* 6 */                 this.f9750id = j;
/* 19 */                this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, new RunnableC1067a(this, 1));
/* 35 */                surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.c
                            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
/* 1 */                         this.f9756a.lambda$new$1(surfaceTexture2);
                            }
                        }, new Handler());
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$new$0() {
/* 1 */                 TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = this.frameConsumedListener;
/* 3 */                 if (onFrameConsumedListener != null) {
/* 5 */                     onFrameConsumedListener.onFrameConsumed();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ void lambda$new$1(SurfaceTexture surfaceTexture) {
/* 3 */                 if (this.released || !FlutterRenderer.this.flutterJNI.isAttached()) {
/* 28 */                    return;
                        }
/* 20 */                this.textureWrapper.markDirty();
/* 25 */                FlutterRenderer.this.scheduleEngineFrame();
                    }

                    private void removeListener() {
/* 3 */                 FlutterRenderer.this.removeOnTrimMemoryListener(this);
                    }

                    public void finalize() throws Throwable {
                        try {
/* 3 */                     if (this.released) {
/* 8 */                         return;
                            }
/* 28 */                    FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f9750id, FlutterRenderer.this.flutterJNI));
                        } finally {
/* 36 */                    super.finalize();
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.TextureEntry
                    /* JADX INFO: renamed from: id */
                    public long mo4606id() {
/* 1 */                 return this.f9750id;
                    }

                    @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
                    public void onTrimMemory(int i) {
/* 1 */                 TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
/* 3 */                 if (onTrimMemoryListener != null) {
/* 5 */                     onTrimMemoryListener.onTrimMemory(i);
                        }
                    }

                    @Override // io.flutter.view.TextureRegistry.TextureEntry
                    public void release() {
/* 3 */                 if (this.released) {
/* 5 */                     return;
                        }
/* 29 */                Log.m4589v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f9750id + ").");
/* 34 */                this.textureWrapper.release();
/* 1 */                 FlutterRenderer.this.unregisterTexture(this.f9750id);
/* 44 */                removeListener();
/* 48 */                this.released = true;
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
                    public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
/* 1 */                 this.frameConsumedListener = onFrameConsumedListener;
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
                    public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
/* 1 */                 this.trimMemoryListener = onTrimMemoryListener;
                    }

                    @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
                    public SurfaceTexture surfaceTexture() {
/* 3 */                 return this.textureWrapper.surfaceTexture();
                    }

                    public SurfaceTextureWrapper textureWrapper() {
/* 1 */                 return this.textureWrapper;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class TextureFinalizerRunnable implements Runnable {
                    private final FlutterJNI flutterJNI;

                    /* JADX INFO: renamed from: id */
                    private final long f9751id;

                    public TextureFinalizerRunnable(long j, FlutterJNI flutterJNI) {
/* 4 */                 this.f9751id = j;
/* 6 */                 this.flutterJNI = flutterJNI;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
/* 7 */                 if (this.flutterJNI.isAttached()) {
/* 33 */                    Log.m4589v(FlutterRenderer.TAG, "Releasing a Texture (" + this.f9751id + ").");
/* 40 */                    this.flutterJNI.unregisterTexture(this.f9751id);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class ViewportMetrics {
                    public static final int unsetValue = -1;
                    public float devicePixelRatio = 1.0f;
                    public int width = 0;
                    public int height = 0;
                    public int viewPaddingTop = 0;
                    public int viewPaddingRight = 0;
                    public int viewPaddingBottom = 0;
                    public int viewPaddingLeft = 0;
                    public int viewInsetTop = 0;
                    public int viewInsetRight = 0;
                    public int viewInsetBottom = 0;
                    public int viewInsetLeft = 0;
                    public int systemGestureInsetTop = 0;
                    public int systemGestureInsetRight = 0;
                    public int systemGestureInsetBottom = 0;
                    public int systemGestureInsetLeft = 0;
                    public int physicalTouchSlop = -1;
                    private final List<DisplayFeature> displayFeatures = new ArrayList();
                    private final List<DisplayFeature> displayCutouts = new ArrayList();

                    public List<DisplayFeature> getDisplayCutouts() {
/* 1 */                 return this.displayCutouts;
                    }

                    public List<DisplayFeature> getDisplayFeatures() {
/* 1 */                 return this.displayFeatures;
                    }

                    public void setDisplayCutouts(List<DisplayFeature> list) {
/* 3 */                 this.displayCutouts.clear();
/* 8 */                 this.displayCutouts.addAll(list);
                    }

                    public void setDisplayFeatures(List<DisplayFeature> list) {
/* 3 */                 this.displayFeatures.clear();
/* 8 */                 this.displayFeatures.addAll(list);
                    }

                    public boolean validate() {
                        return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
                    }
                }

                public FlutterRenderer(FlutterJNI flutterJNI) {
/* 39 */            FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiDisplayed() {
/* 1 */                     FlutterRenderer.this.isDisplayingFlutterUi = true;
                        }

                        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                        public void onFlutterUiNoLongerDisplayed() {
/* 1 */                     FlutterRenderer.this.isDisplayingFlutterUi = false;
                        }
                    };
/* 42 */            this.flutterUiDisplayListener = flutterUiDisplayListener;
/* 44 */            this.flutterJNI = flutterJNI;
/* 46 */            flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
                }

                private void clearDeadListeners() {
/* 3 */             Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
/* 11 */            while (it.hasNext()) {
/* 25 */                if (it.next().get() == null) {
/* 27 */                    it.remove();
                        }
                    }
                }

                private void registerImageTexture(long j, TextureRegistry.ImageConsumer imageConsumer, boolean z) {
/* 3 */             this.flutterJNI.registerImageTexture(j, imageConsumer, z);
                }

                private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j, SurfaceTexture surfaceTexture) {
/* 1 */             surfaceTexture.detachFromGLContext();
/* 6 */             SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(j, surfaceTexture);
/* 29 */            Log.m4589v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.mo4606id());
/* 40 */            registerTexture(surfaceTextureRegistryEntry.mo4606id(), surfaceTextureRegistryEntry.textureWrapper());
/* 43 */            addOnTrimMemoryListener(surfaceTextureRegistryEntry);
/* 46 */            return surfaceTextureRegistryEntry;
                }

                private void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
/* 3 */             this.flutterJNI.registerTexture(j, surfaceTextureWrapper);
                }

                private void translateFeatureBounds(int[] iArr, int i, Rect rect) {
/* 3 */             iArr[i] = rect.left;
/* 9 */             iArr[i + 1] = rect.top;
/* 15 */            iArr[i + 2] = rect.right;
/* 21 */            iArr[i + 3] = rect.bottom;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void unregisterTexture(long j) {
/* 3 */             this.flutterJNI.unregisterTexture(j);
                }

                public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
/* 3 */             this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
/* 8 */             if (this.isDisplayingFlutterUi) {
/* 10 */                flutterUiDisplayListener.onFlutterUiDisplayed();
                    }
                }

                public void addOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
/* 1 */             clearDeadListeners();
/* 11 */            this.onTrimMemoryListeners.add(new WeakReference<>(onTrimMemoryListener));
                }

                @Override // io.flutter.view.TextureRegistry
                public TextureRegistry.ImageTextureEntry createImageTexture() {
/* 9 */             ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
/* 32 */            Log.m4589v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.mo4606id());
/* 40 */            registerImageTexture(imageTextureRegistryEntry.mo4606id(), imageTextureRegistryEntry, false);
/* 43 */            return imageTextureRegistryEntry;
                }

                @Override // io.flutter.view.TextureRegistry
                public TextureRegistry.SurfaceProducer createSurfaceProducer(TextureRegistry.SurfaceLifecycle surfaceLifecycle) {
/* 5 */             if (debugForceSurfaceProducerGlTextures || Build.VERSION.SDK_INT < 29) {
/* 62 */                TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = createSurfaceTexture();
/* 76 */                SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new SurfaceTextureSurfaceProducer(surfaceTextureEntryCreateSurfaceTexture.mo4606id(), this.handler, this.flutterJNI, surfaceTextureEntryCreateSurfaceTexture);
/* 97 */                Log.m4589v(TAG, "New SurfaceTextureSurfaceProducer ID: " + surfaceTextureEntryCreateSurfaceTexture.mo4606id());
/* 100 */               return surfaceTextureSurfaceProducer;
                    }
/* 15 */            long andIncrement = this.nextTextureId.getAndIncrement();
/* 21 */            ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
/* 30 */            boolean z = surfaceLifecycle == TextureRegistry.SurfaceLifecycle.resetInBackground;
/* 31 */            registerImageTexture(andIncrement, imageReaderSurfaceProducer, z);
/* 34 */            if (z) {
/* 36 */                addOnTrimMemoryListener(imageReaderSurfaceProducer);
                    }
/* 41 */            this.imageReaderProducers.add(imageReaderSurfaceProducer);
/* 58 */            Log.m4589v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
/* 61 */            return imageReaderSurfaceProducer;
                }

                @Override // io.flutter.view.TextureRegistry
                public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
/* 5 */             Log.m4589v(TAG, "Creating a SurfaceTexture.");
/* 14 */            return registerSurfaceTexture(new SurfaceTexture(0));
                }

                public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
/* 3 */             this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i);
                }

                public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
/* 3 */             this.flutterJNI.dispatchSemanticsAction(i, i2, byteBuffer, i3);
                }

                public Bitmap getBitmap() {
/* 3 */             return this.flutterJNI.getBitmap();
                }

                public boolean isDisplayingFlutterUi() {
/* 1 */             return this.isDisplayingFlutterUi;
                }

                public boolean isSoftwareRenderingEnabled() {
/* 3 */             return this.flutterJNI.getIsSoftwareRenderingEnabled();
                }

                @Override // io.flutter.view.TextureRegistry
                public void onTrimMemory(int i) {
/* 3 */             Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
/* 25 */                if (onTrimMemoryListener != null) {
/* 27 */                    onTrimMemoryListener.onTrimMemory(i);
                        } else {
/* 31 */                    it.remove();
                        }
                    }
                }

                public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
/* 3 */             this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
                }

                public void removeOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
/* 11 */            for (WeakReference<TextureRegistry.OnTrimMemoryListener> weakReference : this.onTrimMemoryListeners) {
/* 23 */                if (weakReference.get() == onTrimMemoryListener) {
/* 27 */                    this.onTrimMemoryListeners.remove(weakReference);
/* 30 */                    return;
                        }
                    }
                }

                public void restoreSurfaceProducers() {
/* 5 */             Log.m4589v(TAG, "restoreSurfaceProducers called; notifying SurfaceProducers");
/* 18 */            for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : this.imageReaderProducers) {
/* 26 */                TextureRegistry.SurfaceProducer.Callback callback = imageReaderSurfaceProducer.callback;
/* 28 */                if (callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
/* 35 */                    imageReaderSurfaceProducer.notifiedDestroy = false;
/* 37 */                    callback.onSurfaceAvailable();
                        }
                    }
                }

                public void scheduleEngineFrame() {
/* 3 */             this.flutterJNI.scheduleFrame();
                }

                public void setAccessibilityFeatures(int i) {
/* 3 */             this.flutterJNI.setAccessibilityFeatures(i);
                }

                public void setSemanticsEnabled(boolean z) {
/* 3 */             this.flutterJNI.setSemanticsEnabled(z);
                }

                public void setViewportMetrics(ViewportMetrics viewportMetrics) {
/* 9 */             if (viewportMetrics.validate()) {
/* 180 */               Log.m4589v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.width + " x " + viewportMetrics.height + "\nPadding - L: " + viewportMetrics.viewPaddingLeft + ", T: " + viewportMetrics.viewPaddingTop + ", R: " + viewportMetrics.viewPaddingRight + ", B: " + viewportMetrics.viewPaddingBottom + "\nInsets - L: " + viewportMetrics.viewInsetLeft + ", T: " + viewportMetrics.viewInsetTop + ", R: " + viewportMetrics.viewInsetRight + ", B: " + viewportMetrics.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics.systemGestureInsetLeft + ", T: " + viewportMetrics.systemGestureInsetTop + ", R: " + viewportMetrics.systemGestureInsetRight + ", B: " + viewportMetrics.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size() + "\nDisplay Cutouts: " + viewportMetrics.displayCutouts.size());
/* 199 */               int size = viewportMetrics.displayCutouts.size() + viewportMetrics.displayFeatures.size();
/* 202 */               int[] iArr = new int[size * 4];
/* 204 */               int[] iArr2 = new int[size];
/* 206 */               int[] iArr3 = new int[size];
/* 218 */               for (int i = 0; i < viewportMetrics.displayFeatures.size(); i++) {
/* 228 */                   DisplayFeature displayFeature = (DisplayFeature) viewportMetrics.displayFeatures.get(i);
/* 234 */                   translateFeatureBounds(iArr, i * 4, displayFeature.bounds);
/* 241 */                   iArr2[i] = displayFeature.type.encodedValue;
/* 247 */                   iArr3[i] = displayFeature.state.encodedValue;
                        }
/* 260 */               int size2 = viewportMetrics.displayFeatures.size() * 4;
/* 270 */               for (int i2 = 0; i2 < viewportMetrics.displayCutouts.size(); i2++) {
/* 280 */                   DisplayFeature displayFeature2 = (DisplayFeature) viewportMetrics.displayCutouts.get(i2);
/* 287 */                   translateFeatureBounds(iArr, (i2 * 4) + size2, displayFeature2.bounds);
/* 303 */                   iArr2[viewportMetrics.displayFeatures.size() + i2] = displayFeature2.type.encodedValue;
/* 318 */                   iArr3[viewportMetrics.displayFeatures.size() + i2] = displayFeature2.state.encodedValue;
                        }
/* 383 */               this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.viewPaddingTop, viewportMetrics.viewPaddingRight, viewportMetrics.viewPaddingBottom, viewportMetrics.viewPaddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, iArr, iArr2, iArr3);
                    }
                }

                public void startRenderingToSurface(Surface surface, boolean z) {
/* 1 */             if (!z) {
/* 3 */                 stopRenderingToSurface();
                    }
/* 6 */             this.surface = surface;
/* 8 */             FlutterJNI flutterJNI = this.flutterJNI;
/* 10 */            if (z) {
/* 12 */                flutterJNI.onSurfaceWindowChanged(surface);
                    } else {
/* 16 */                flutterJNI.onSurfaceCreated(surface);
                    }
                }

                public void stopRenderingToSurface() {
/* 3 */             if (this.surface != null) {
/* 7 */                 this.flutterJNI.onSurfaceDestroyed();
/* 12 */                if (this.isDisplayingFlutterUi) {
/* 16 */                    this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
                        }
/* 20 */                this.isDisplayingFlutterUi = false;
/* 23 */                this.surface = null;
                    }
                }

                public void surfaceChanged(int i, int i2) {
/* 3 */             this.flutterJNI.onSurfaceChanged(i, i2);
                }

                public void swapSurface(Surface surface) {
/* 1 */             this.surface = surface;
/* 5 */             this.flutterJNI.onSurfaceWindowChanged(surface);
                }

                @Override // io.flutter.view.TextureRegistry
/* 46 */        public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
/* 47 */            return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
                }
            }
