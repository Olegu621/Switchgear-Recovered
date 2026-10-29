            package io.flutter.embedding.engine;

            import android.content.Context;
            import android.content.res.AssetManager;
            import android.graphics.Bitmap;
            import android.graphics.ColorSpace;
            import android.graphics.ImageDecoder;
            import android.os.Build;
            import android.os.Looper;
            import android.util.DisplayMetrics;
            import android.util.Size;
            import android.util.TypedValue;
            import android.view.Surface;
            import android.view.SurfaceControl;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.dart.PlatformMessageHandler;
            import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
            import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
            import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
            import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
            import io.flutter.embedding.engine.systemchannels.SettingsChannel;
            import io.flutter.plugin.common.StandardMessageCodec;
            import io.flutter.plugin.localization.LocalizationPlugin;
            import io.flutter.plugin.platform.PlatformViewsController;
            import io.flutter.plugin.platform.PlatformViewsController2;
            import io.flutter.util.Preconditions;
            import io.flutter.view.AccessibilityBridge;
            import io.flutter.view.FlutterCallbackInformation;
            import io.flutter.view.TextureRegistry;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.ref.WeakReference;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.locks.ReentrantReadWriteLock;
            import java.util.zip.ZipEntry;
            import java.util.zip.ZipFile;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0210cb;
            import p000.C1951n4;
            import p000.C2086px;
            import p000.dc0;
            import p000.f42;
            import p000.fm0;
            import p000.p62;
            import p000.ra2;
            import p000.s80;
            import p000.u02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public class FlutterJNI {
                private static final String TAG = "FlutterJNI";
                private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
                private static float displayDensity = -1.0f;
                private static float displayHeight = -1.0f;
                private static float displayWidth = -1.0f;
                private static boolean initCalled = false;
                private static boolean loadLibraryCalled = false;
                private static boolean prefetchDefaultFontManagerCalled = false;
                private static float refreshRateFPS = 60.0f;
                private static String vmServiceUri;
                private AccessibilityDelegate accessibilityDelegate;
                private DeferredComponentManager deferredComponentManager;
                private LocalizationPlugin localizationPlugin;
                private Long nativeShellHolderId;
                private PlatformMessageHandler platformMessageHandler;
                private PlatformViewsController platformViewsController;
                private PlatformViewsController2 platformViewsController2;
                private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
                private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
                private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
                private final Looper mainLooper = Looper.getMainLooper();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AccessibilityDelegate {
                    void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr);

                    void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AsyncWaitForVsyncDelegate {
                    void asyncWaitForVsync(long j);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Factory {
                    public FlutterJNI provideFlutterJNI() {
/* 3 */                 return new FlutterJNI();
                    }
                }

                private static void asyncWaitForVsync(long j) {
/* 1 */             AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
/* 3 */             if (asyncWaitForVsyncDelegate2 != null) {
/* 5 */                 asyncWaitForVsyncDelegate2.asyncWaitForVsync(j);
                    } else {
/* 11 */                f42.m3656l("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
                    }
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [tk0] */
                public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j) {
/* 6 */             if (Build.VERSION.SDK_INT >= 28) {
                        try {
/* 1 */                     return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: tk0
                                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
/* 1 */                             FlutterJNI.lambda$decodeImage$1(j, imageDecoder, imageInfo, source);
                                }
                            });
                        } catch (IOException e) {
/* 27 */                    Log.m4586e(TAG, "Failed to decode image", e);
                        }
                    }
/* 5 */             return null;
                }

                private void ensureAttachedToNative() {
/* 3 */             if (this.nativeShellHolderId != null) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3663s("Cannot execute operation because FlutterJNI is not attached to native.");
                }

                private void ensureNotAttachedToNative() {
/* 3 */             if (this.nativeShellHolderId == null) {
/* 5 */                 return;
                    }
/* 8 */             f42.m3663s("Cannot execute operation because FlutterJNI is attached to native.");
                }

                private void ensureRunningOnMainThread() {
/* 7 */             if (Looper.myLooper() == this.mainLooper) {
/* 9 */                 return;
                    }
/* 20 */            s80.m8423d(Thread.currentThread().getName(), "Methods marked with @UiThread must be executed on the main thread. Current thread: ");
                }

                public static String getVMServiceUri() {
/* 1 */             return vmServiceUri;
                }

                private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
/* 1 */             PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
/* 3 */             if (platformMessageHandler != null) {
/* 5 */                 platformMessageHandler.handlePlatformMessageResponse(i, byteBuffer);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$decodeImage$1(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
/* 1 */             ColorSpace.Named unused = ColorSpace.Named.SRGB;
/* 1 */             imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
/* 2 */             imageDecoder.setAllocator(1);
/* 1 */             Size size = imageInfo.getSize();
/* 26 */            nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
                }

                private native long nativeAttach(FlutterJNI flutterJNI);

                private native void nativeCleanupMessageData(long j);

                private native void nativeDeferredComponentInstallFailure(int i, String str, boolean z);

                private native void nativeDestroy(long j);

                private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

                private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

                private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

                private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

                private native boolean nativeFlutterTextUtilsIsEmoji(int i);

                private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

                private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

                private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

                private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

                private native Bitmap nativeGetBitmap(long j);

                private native boolean nativeGetIsSoftwareRenderingEnabled();

                public static native void nativeImageHeaderCallback(long j, int i, int i2);

                private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i);

                private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

                private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

                private native boolean nativeIsSurfaceControlEnabled(long j);

                private native void nativeLoadDartDeferredLibrary(long j, int i, String[] strArr);

                @Deprecated
                public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

                private native void nativeMarkTextureFrameAvailable(long j, long j2);

                private native void nativeNotifyLowMemoryWarning(long j);

                private native void nativeOnVsync(long j, long j2, long j3);

                private static native void nativePrefetchDefaultFontManager();

                private native void nativeRegisterImageTexture(long j, long j2, WeakReference<TextureRegistry.ImageConsumer> weakReference, boolean z);

                private native void nativeRegisterTexture(long j, long j2, WeakReference<SurfaceTextureWrapper> weakReference);

                private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2);

                private native void nativeScheduleFrame(long j);

                private native void nativeSetAccessibilityFeatures(long j, int i);

                private native void nativeSetSemanticsEnabled(long j, boolean z);

                private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3);

                private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j2);

                private native void nativeSurfaceChanged(long j, int i, int i2);

                private native void nativeSurfaceCreated(long j, Surface surface);

                private native void nativeSurfaceDestroyed(long j);

                private native void nativeSurfaceWindowChanged(long j, Surface surface);

                private native void nativeUnregisterTexture(long j, long j2);

                private native void nativeUpdateDisplayMetrics(long j);

                private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

                private native void nativeUpdateRefreshRate(float f);

                private void onPreEngineRestart() {
/* 3 */             Iterator<FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                it.next().onPreEngineRestart();
                    }
                }

                private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
/* 6 */             if (accessibilityDelegate != null) {
/* 8 */                 accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
                    }
                }

                private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
/* 6 */             if (accessibilityDelegate != null) {
/* 8 */                 accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
                    }
                }

                public boolean IsSurfaceControlEnabled() {
/* 7 */             return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
                }

                public void addEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
/* 1 */             ensureRunningOnMainThread();
/* 6 */             this.engineLifecycleListeners.add(engineLifecycleListener);
                }

                public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
/* 1 */             ensureRunningOnMainThread();
/* 6 */             this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
                }

                public void applyTransactions() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 platformViewsController2.applyTransactions();
                    } else {
/* 11 */                f42.m3663s(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }

                public void attachToNative() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureNotAttachedToNative();
/* 13 */            this.shellHolderLock.writeLock().lock();
                    try {
/* 24 */                this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
                    } finally {
/* 43 */                this.shellHolderLock.writeLock().unlock();
                    }
                }

                public void cleanupMessageData(long j) {
/* 1 */             nativeCleanupMessageData(j);
                }

                public String[] computePlatformResolvedLocale(String[] strArr) {
/* 4 */             if (this.localizationPlugin == null) {
/* 6 */                 return new String[0];
                    }
/* 11 */            ArrayList arrayList = new ArrayList();
/* 16 */            for (int i = 0; i < strArr.length; i += 3) {
/* 18 */                String str = strArr[i];
/* 22 */                String str2 = strArr[i + 1];
/* 26 */                String str3 = strArr[i + 2];
/* 30 */                Locale.Builder builder = new Locale.Builder();
/* 37 */                if (!str.isEmpty()) {
/* 39 */                    builder.setLanguage(str);
                        }
/* 46 */                if (!str2.isEmpty()) {
/* 48 */                    builder.setRegion(str2);
                        }
/* 55 */                if (!str3.isEmpty()) {
/* 57 */                    builder.setScript(str3);
                        }
/* 64 */                arrayList.add(builder.build());
                    }
/* 72 */            Locale localeResolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
                    return localeResolveNativeLocale == null ? new String[0] : new String[]{localeResolveNativeLocale.getLanguage(), localeResolveNativeLocale.getCountry(), localeResolveNativeLocale.getScript()};
                }

                public FlutterOverlaySurface createOverlaySurface() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController platformViewsController = this.platformViewsController;
/* 6 */             if (platformViewsController != null) {
/* 8 */                 return platformViewsController.createOverlaySurface();
                    }
/* 15 */            f42.m3663s("platformViewsController must be set before attempting to position an overlay surface");
/* 18 */            return null;
                }

                public FlutterOverlaySurface createOverlaySurface2() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 return platformViewsController2.createOverlaySurface();
                    }
/* 12 */            f42.m3663s("platformViewsController must be set before attempting to position an overlay surface");
/* 15 */            return null;
                }

                public SurfaceControl.Transaction createTransaction() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 return platformViewsController2.createTransaction();
                    }
/* 12 */            f42.m3663s(HttpUrl.FRAGMENT_ENCODE_SET);
/* 15 */            return null;
                }

                public void deferredComponentInstallFailure(int i, String str, boolean z) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             nativeDeferredComponentInstallFailure(i, str, z);
                }

                public void destroyOverlaySurface2() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 6 */             if (platformViewsController2 != null) {
/* 8 */                 platformViewsController2.destroyOverlaySurface();
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to destroy an overlay surface");
                    }
                }

                public void destroyOverlaySurfaces() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController platformViewsController = this.platformViewsController;
/* 6 */             if (platformViewsController != null) {
/* 8 */                 platformViewsController.destroyOverlaySurfaces();
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to destroy an overlay surface");
                    }
                }

                public void detachFromNativeAndReleaseResources() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            this.shellHolderLock.writeLock().lock();
                    try {
/* 22 */                nativeDestroy(this.nativeShellHolderId.longValue());
/* 26 */                this.nativeShellHolderId = null;
                    } finally {
/* 45 */                this.shellHolderLock.writeLock().unlock();
                    }
                }

                public void dispatchEmptyPlatformMessage(String str, int i) {
/* 1 */             ensureRunningOnMainThread();
/* 8 */             if (isAttached()) {
/* 16 */                nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
/* 19 */                return;
                    }
/* 44 */            Log.m4591w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
                }

                public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
/* 1 */             ensureRunningOnMainThread();
/* 8 */             if (isAttached()) {
/* 21 */                nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
/* 24 */                return;
                    }
/* 51 */            Log.m4591w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
                }

                public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
                }

                public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
                    ByteBuffer byteBufferEncodeMessage;
                    int iPosition;
/* 1 */             ensureAttachedToNative();
/* 4 */             if (obj != null) {
/* 8 */                 byteBufferEncodeMessage = StandardMessageCodec.INSTANCE.encodeMessage(obj);
/* 12 */                iPosition = byteBufferEncodeMessage.position();
                    } else {
/* 17 */                byteBufferEncodeMessage = null;
/* 18 */                iPosition = 0;
                    }
/* 21 */            dispatchSemanticsAction(i, action.value, byteBufferEncodeMessage, iPosition);
                }

                public void endFrame2() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 platformViewsController2.onEndFrame();
                    } else {
/* 11 */                f42.m3663s(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }

                public Bitmap getBitmap() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            return nativeGetBitmap(this.nativeShellHolderId.longValue());
                }

                public boolean getIsSoftwareRenderingEnabled() {
/* 1 */             return nativeGetIsSoftwareRenderingEnabled();
                }

                public float getScaledFontSize(float f, int i) {
/* 1 */             DisplayMetrics pastDisplayMetrics = SettingsChannel.getPastDisplayMetrics(i);
/* 5 */             if (pastDisplayMetrics != null) {
/* 45 */                return TypedValue.applyDimension(2, f, pastDisplayMetrics) / pastDisplayMetrics.density;
                    }
/* 32 */            Log.m4585e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i) + ", which can't be found.");
/* 35 */            return -1.0f;
                }

                public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i, long j) {
/* 1 */             PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
/* 3 */             if (platformMessageHandler != null) {
/* 9 */                 platformMessageHandler.handleMessageFromDart(str, byteBuffer, i, j);
                    } else {
/* 14 */                nativeCleanupMessageData(j);
                    }
                }

                public void hideOverlaySurface2() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 platformViewsController2.hideOverlaySurface();
                    } else {
/* 11 */                f42.m3663s("platformViewsController must be set before attempting to destroy an overlay surface");
                    }
                }

                public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i) {
/* 3 */             if (initCalled) {
/* 9 */                 Log.m4591w(TAG, "FlutterJNI.init called more than once");
                    }
/* 12 */            nativeInit(context, strArr, str, str2, str3, j, i);
/* 16 */            initCalled = true;
                }

                public void invokePlatformMessageEmptyResponseCallback(int i) {
/* 9 */             this.shellHolderLock.readLock().lock();
                    try {
/* 16 */                if (isAttached()) {
/* 24 */                    nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
                        } else {
/* 44 */                    Log.m4591w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
                        }
                    } finally {
/* 63 */                this.shellHolderLock.readLock().unlock();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
                /* JADX WARN: Type inference failed for: r1v8, types: [io.flutter.embedding.engine.FlutterJNI] */
                public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
                    FlutterJNI flutterJNIIsAttached;
/* 7 */             if (!byteBuffer.isDirect()) {
/* 85 */                C1951n4.m6859j("Expected a direct ByteBuffer.");
/* 88 */                return;
                    }
/* 15 */            this.shellHolderLock.readLock().lock();
                    try {
/* 18 */                flutterJNIIsAttached = isAttached();
                        try {
/* 22 */                    if (flutterJNIIsAttached != 0) {
/* 30 */                        FlutterJNI flutterJNI = this;
/* 34 */                        flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
                                flutterJNIIsAttached = flutterJNI;
                            } else {
/* 44 */                        flutterJNIIsAttached = this;
/* 60 */                        Log.m4591w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
                            }
/* 69 */                    flutterJNIIsAttached.shellHolderLock.readLock().unlock();
                        } catch (Throwable th) {
/* 38 */                    th = th;
/* 39 */                    Throwable th2 = th;
/* 79 */                    flutterJNIIsAttached.shellHolderLock.readLock().unlock();
/* 82 */                    throw th2;
                        }
                    } catch (Throwable th3) {
/* 41 */                th = th3;
/* 42 */                flutterJNIIsAttached = this;
                    }
                }

                public boolean isAttached() {
                    return this.nativeShellHolderId != null;
                }

                public boolean isCodePointEmoji(int i) {
/* 1 */             return nativeFlutterTextUtilsIsEmoji(i);
                }

                public boolean isCodePointEmojiModifier(int i) {
/* 1 */             return nativeFlutterTextUtilsIsEmojiModifier(i);
                }

                public boolean isCodePointEmojiModifierBase(int i) {
/* 1 */             return nativeFlutterTextUtilsIsEmojiModifierBase(i);
                }

                public boolean isCodePointRegionalIndicator(int i) {
/* 1 */             return nativeFlutterTextUtilsIsRegionalIndicator(i);
                }

                public boolean isCodePointVariantSelector(int i) {
/* 1 */             return nativeFlutterTextUtilsIsVariationSelector(i);
                }

                public void loadDartDeferredLibrary(int i, String[] strArr) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
                }

                public void loadLibrary(Context context) throws Throwable {
                    String[] strArrM2988i;
                    InputStream inputStream;
                    InputStream inputStream2;
                    FileOutputStream fileOutputStreamM5167e;
/* 5 */             if (loadLibraryCalled) {
/* 11 */                Log.m4591w(TAG, "FlutterJNI.loadLibrary called more than once");
                    }
/* 18 */            s80 s80Var = new s80(18);
/* 23 */            ra2 ra2Var = new ra2(18);
/* 26 */            ra2Var.f15958d = s80Var;
/* 28 */            if (context == null) {
/* 479 */               C1951n4.m6859j("Given context is null");
/* 482 */               return;
                    }
/* 38 */            ra2Var.m8113r("Beginning load of %s...", "flutter");
/* 44 */            p62 p62Var = (p62) ra2Var.f15956b;
/* 49 */            HashSet hashSet = (HashSet) ra2Var.f15955a;
/* 55 */            if (hashSet.contains("flutter")) {
/* 63 */                ra2Var.m8113r("%s already loaded previously!", "flutter");
                    } else {
/* 70 */                C0210cb c0210cb = null;
                        try {
/* 71 */                    p62Var.getClass();
/* 74 */                    System.loadLibrary("flutter");
/* 77 */                    hashSet.add("flutter");
/* 86 */                    ra2Var.m8113r("%s (%s) was loaded normally!", "flutter", null);
                        } catch (UnsatisfiedLinkError e) {
/* 101 */                   ra2Var.m8113r("Loading the library normally failed: %s", android.util.Log.getStackTraceString(e));
/* 110 */                   ra2Var.m8113r("%s (%s) was not loaded normally, re-linking...", "flutter", null);
/* 113 */                   File fileM8110o = ra2Var.m8110o(context);
/* 121 */                   if (!fileM8110o.exists()) {
/* 128 */                       File dir = context.getDir("lib", 0);
/* 132 */                       File fileM8110o2 = ra2Var.m8110o(context);
/* 136 */                       p62Var.getClass();
/* 148 */                       File[] fileArrListFiles = dir.listFiles(new u02(System.mapLibraryName("flutter")));
/* 152 */                       if (fileArrListFiles != null) {
/* 157 */                           for (File file : fileArrListFiles) {
/* 173 */                               if (!file.getAbsolutePath().equals(fileM8110o2.getAbsolutePath())) {
/* 175 */                                   file.delete();
                                        }
                                    }
                                }
/* 183 */                       dc0 dc0Var = (dc0) ra2Var.f15957c;
/* 185 */                       String[] strArr = Build.SUPPORTED_ABIS;
/* 188 */                       if (strArr.length <= 0) {
/* 191 */                           String str = Build.CPU_ABI2;
/* 211 */                           strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                                }
/* 215 */                       String strMapLibraryName = System.mapLibraryName("flutter");
/* 219 */                       dc0Var.getClass();
                                try {
/* 222 */                           C0210cb c0210cbM2987e = dc0.m2987e(context, strArr, strMapLibraryName, ra2Var);
                                    try {
/* 226 */                               if (c0210cbM2987e == null) {
                                            try {
/* 415 */                                       strArrM2988i = dc0.m2988i(context, strMapLibraryName);
                                            } catch (Exception e2) {
/* 425 */                                       strArrM2988i = new String[]{e2.toString()};
                                            }
/* 435 */                                   StringBuilder sbM3513q = AbstractC0886en.m3513q("Could not find '", strMapLibraryName, "'. Looked for: ");
/* 443 */                                   sbM3513q.append(Arrays.toString(strArr));
/* 448 */                                   sbM3513q.append(", but only found: ");
/* 464 */                                   throw new C2086px(fm0.m3789o(sbM3513q, Arrays.toString(strArrM2988i), "."));
                                        }
/* 230 */                               ZipFile zipFile = (ZipFile) c0210cbM2987e.f2804b;
/* 232 */                               int i = 0;
                                        while (true) {
/* 233 */                                   int i2 = i + 1;
/* 236 */                                   if (i >= 5) {
/* 381 */                                       if (((s80) ra2Var.f15958d) == null) {
                                                    break;
                                                }
/* 3 */                                         Log.m4583d(TAG, "FATAL! Couldn't extract the library from the APK!");
                                                break;
                                            }
/* 244 */                                   ra2Var.m8113r("Found %s! Extracting...", strMapLibraryName);
                                            try {
/* 251 */                                       if (fileM8110o.exists() || fileM8110o.createNewFile()) {
                                                    try {
/* 269 */                                               inputStream2 = zipFile.getInputStream((ZipEntry) c0210cbM2987e.f2805c);
                                                        try {
/* 278 */                                                   fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(fileM8110o), fileM8110o);
                                                            try {
                                                                try {
/* 284 */                                                           byte[] bArr = new byte[4096];
/* 286 */                                                           long j = 0;
                                                                    while (true) {
/* 288 */                                                               int i3 = inputStream2.read(bArr);
/* 293 */                                                               if (i3 == -1) {
                                                                            break;
                                                                        }
/* 343 */                                                               fileOutputStreamM5167e.write(bArr, 0, i3);
/* 347 */                                                               j += (long) i3;
                                                                    }
/* 295 */                                                           fileOutputStreamM5167e.flush();
/* 302 */                                                           fileOutputStreamM5167e.getFD().sync();
/* 311 */                                                           if (j == fileM8110o.length()) {
/* 320 */                                                               dc0.m2986c(inputStream2);
/* 323 */                                                               dc0.m2986c(fileOutputStreamM5167e);
/* 327 */                                                               fileM8110o.setReadable(true, false);
/* 330 */                                                               fileM8110o.setExecutable(true, false);
/* 333 */                                                               fileM8110o.setWritable(true);
                                                                        break;
                                                                    }
                                                                } catch (FileNotFoundException | IOException unused) {
                                                                }
                                                            } catch (Throwable th) {
/* 340 */                                                       th = th;
/* 341 */                                                       inputStream = inputStream2;
/* 364 */                                                       dc0.m2986c(inputStream);
/* 367 */                                                       dc0.m2986c(fileOutputStreamM5167e);
/* 370 */                                                       throw th;
                                                            }
                                                        } catch (FileNotFoundException unused2) {
/* 355 */                                                   fileOutputStreamM5167e = null;
/* 313 */                                                   dc0.m2986c(inputStream2);
/* 316 */                                                   dc0.m2986c(fileOutputStreamM5167e);
/* 371 */                                                   i = i2;
                                                        } catch (IOException unused3) {
/* 353 */                                                   fileOutputStreamM5167e = null;
/* 313 */                                                   dc0.m2986c(inputStream2);
/* 316 */                                                   dc0.m2986c(fileOutputStreamM5167e);
/* 371 */                                                   i = i2;
                                                        } catch (Throwable th2) {
/* 349 */                                                   th = th2;
/* 350 */                                                   inputStream = inputStream2;
/* 351 */                                                   fileOutputStreamM5167e = null;
/* 364 */                                                   dc0.m2986c(inputStream);
/* 367 */                                                   dc0.m2986c(fileOutputStreamM5167e);
/* 370 */                                                   throw th;
                                                        }
                                                    } catch (FileNotFoundException unused4) {
/* 362 */                                               inputStream2 = null;
                                                    } catch (IOException unused5) {
/* 360 */                                               inputStream2 = null;
                                                    } catch (Throwable th3) {
/* 357 */                                               th = th3;
/* 358 */                                               inputStream = null;
                                                    }
/* 313 */                                           dc0.m2986c(inputStream2);
/* 316 */                                           dc0.m2986c(fileOutputStreamM5167e);
                                                }
                                            } catch (IOException unused6) {
                                            }
/* 371 */                                   i = i2;
                                        }
                                        try {
/* 336 */                                   zipFile.close();
                                        } catch (IOException unused7) {
                                        }
                                    } catch (Throwable th4) {
/* 261 */                               th = th4;
/* 262 */                               c0210cb = c0210cbM2987e;
/* 467 */                               if (c0210cb != null) {
                                            try {
/* 473 */                                       ((ZipFile) c0210cb.f2804b).close();
                                            } catch (IOException unused8) {
                                            }
                                        }
/* 476 */                               throw th;
                                    }
                                } catch (Throwable th5) {
/* 465 */                           th = th5;
                                }
                            }
/* 387 */                   String absolutePath = fileM8110o.getAbsolutePath();
/* 391 */                   p62Var.getClass();
/* 394 */                   System.load(absolutePath);
/* 397 */                   hashSet.add("flutter");
/* 407 */                   ra2Var.m8113r("%s (%s) was re-linked!", "flutter", null);
                        }
                    }
/* 412 */           loadLibraryCalled = true;
                }

                public void markTextureFrameAvailable(long j) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
                }

                public void notifyLowMemoryWarning() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
                }

                public void onBeginFrame() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController platformViewsController = this.platformViewsController;
/* 6 */             if (platformViewsController != null) {
/* 8 */                 platformViewsController.onBeginFrame();
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to begin the frame");
                    }
                }

                public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController platformViewsController = this.platformViewsController;
/* 6 */             if (platformViewsController != null) {
/* 8 */                 platformViewsController.onDisplayOverlaySurface(i, i2, i3, i4, i5);
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to position an overlay surface");
                    }
                }

                public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController platformViewsController = this.platformViewsController;
/* 6 */             if (platformViewsController != null) {
/* 8 */                 platformViewsController.onDisplayPlatformView(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to position a platform view");
                    }
                }

                public void onDisplayPlatformView2(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 6 */             if (platformViewsController2 != null) {
/* 8 */                 platformViewsController2.onDisplayPlatformView(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to position a platform view");
                    }
                }

                public void onEndFrame() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             PlatformViewsController platformViewsController = this.platformViewsController;
/* 6 */             if (platformViewsController != null) {
/* 8 */                 platformViewsController.onEndFrame();
                    } else {
/* 14 */                f42.m3663s("platformViewsController must be set before attempting to end the frame");
                    }
                }

                public void onFirstFrame() {
/* 1 */             ensureRunningOnMainThread();
/* 6 */             Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                it.next().onFlutterUiDisplayed();
                    }
                }

                public void onRenderingStopped() {
/* 1 */             ensureRunningOnMainThread();
/* 6 */             Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                it.next().onFlutterUiNoLongerDisplayed();
                    }
                }

                public void onSurfaceChanged(int i, int i2) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
                }

                public void onSurfaceCreated(Surface surface) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
                }

                public void onSurfaceDestroyed() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 7 */             onRenderingStopped();
/* 16 */            nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
                }

                public void onSurfaceWindowChanged(Surface surface) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
                }

                public void onVsync(long j, long j2, long j3) {
/* 1 */             nativeOnVsync(j, j2, j3);
                }

                public long performNativeAttach(FlutterJNI flutterJNI) {
/* 1 */             return nativeAttach(flutterJNI);
                }

                public void prefetchDefaultFontManager() {
/* 3 */             if (prefetchDefaultFontManagerCalled) {
/* 9 */                 Log.m4591w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
                    }
/* 12 */            nativePrefetchDefaultFontManager();
/* 16 */            prefetchDefaultFontManagerCalled = true;
                }

                public void registerImageTexture(long j, TextureRegistry.ImageConsumer imageConsumer, boolean z) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 21 */            nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(imageConsumer), z);
                }

                public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 20 */            nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
                }

                public void removeEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
/* 1 */             ensureRunningOnMainThread();
/* 6 */             this.engineLifecycleListeners.remove(engineLifecycleListener);
                }

                public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
/* 1 */             ensureRunningOnMainThread();
/* 6 */             this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
                }

                public void requestDartDeferredLibrary(int i) {
/* 1 */             DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
/* 3 */             if (deferredComponentManager != null) {
/* 6 */                 deferredComponentManager.installDeferredComponent(i, null);
                    } else {
/* 14 */                Log.m4585e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
                    }
                }

                public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 21 */            nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
                }

                public void scheduleFrame() {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeScheduleFrame(this.nativeShellHolderId.longValue());
                }

                public void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             this.accessibilityDelegate = accessibilityDelegate;
                }

                public void setAccessibilityFeatures(int i) {
/* 1 */             ensureRunningOnMainThread();
/* 8 */             if (isAttached()) {
/* 10 */                setAccessibilityFeaturesInNative(i);
                    }
                }

                public void setAccessibilityFeaturesInNative(int i) {
/* 7 */             nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
                }

                public void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
/* 1 */             asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
                }

                public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             this.deferredComponentManager = deferredComponentManager;
/* 6 */             if (deferredComponentManager != null) {
/* 8 */                 deferredComponentManager.setJNI(this);
                    }
                }

                public void setLocalizationPlugin(LocalizationPlugin localizationPlugin) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             this.localizationPlugin = localizationPlugin;
                }

                public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             this.platformMessageHandler = platformMessageHandler;
                }

                public void setPlatformViewsController(PlatformViewsController platformViewsController) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             this.platformViewsController = platformViewsController;
                }

                public void setPlatformViewsController2(PlatformViewsController2 platformViewsController2) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             this.platformViewsController2 = platformViewsController2;
                }

                public void setRefreshRateFPS(float f) {
/* 1 */             refreshRateFPS = f;
/* 3 */             updateRefreshRate();
                }

                public void setSemanticsEnabled(boolean z) {
/* 1 */             ensureRunningOnMainThread();
/* 8 */             if (isAttached()) {
/* 10 */                setSemanticsEnabledInNative(z);
                    }
                }

                public void setSemanticsEnabledInNative(boolean z) {
/* 7 */             nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
                }

                public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3) {
/* 1 */             ensureRunningOnMainThread();
/* 2 */             ensureAttachedToNative();
/* 5 */             nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, iArr, iArr2, iArr3);
                }

                public void showOverlaySurface2() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 platformViewsController2.showOverlaySurface();
                    } else {
/* 11 */                f42.m3663s("platformViewsController must be set before attempting to destroy an overlay surface");
                    }
                }

                public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 19 */            FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
/* 23 */            Long l = flutterJNINativeSpawn.nativeShellHolderId;
/* 42 */            Preconditions.checkState((l == null || l.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
/* 45 */            return flutterJNINativeSpawn;
                }

                public void swapTransactions() {
/* 1 */             PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
/* 3 */             if (platformViewsController2 != null) {
/* 5 */                 platformViewsController2.swapTransactions();
                    } else {
/* 11 */                f42.m3663s(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }

                public void unregisterTexture(long j) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
                }

                public void updateDisplayMetrics(int i, float f, float f2, float f3) {
/* 1 */             displayWidth = f;
/* 3 */             displayHeight = f2;
/* 5 */             displayDensity = f3;
/* 9 */             if (loadLibraryCalled) {
/* 18 */                nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
                    }
                }

                public void updateJavaAssetManager(AssetManager assetManager, String str) {
/* 1 */             ensureRunningOnMainThread();
/* 4 */             ensureAttachedToNative();
/* 13 */            nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
                }

                public void updateRefreshRate() {
/* 3 */             if (loadLibraryCalled) {
/* 8 */                 nativeUpdateRefreshRate(refreshRateFPS);
                    }
                }

/* 24 */        public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
/* 25 */            dispatchSemanticsAction(i, action, null);
                }

/* 25 */        public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
/* 26 */            ensureRunningOnMainThread();
/* 27 */            ensureAttachedToNative();
/* 28 */            nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
                }
            }
