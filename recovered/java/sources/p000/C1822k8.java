            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.media.Image;
            import android.media.ImageReader;
            import android.text.TextUtils;
            import android.view.Surface;
            import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
            import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
            import io.sentry.C1446f2;
            import io.sentry.C1535l2;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.C1165a1;
            import io.sentry.android.core.C1175b1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.vendor.gson.stream.C1730a;
            import io.sentry.vendor.gson.stream.EnumC1731b;
            import java.io.BufferedInputStream;
            import java.io.ByteArrayInputStream;
            import java.io.EOFException;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.InputStreamReader;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Properties;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: k8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 39 */    public final class C1822k8 implements ow0 {

                /* JADX INFO: renamed from: a */
                public boolean f12643a;

                /* JADX INFO: renamed from: b */
                public final Object f12644b;

                /* JADX INFO: renamed from: c */
                public final Object f12645c;

                public C1822k8(C0962gp c0962gp) {
/* 4 */             this.f12644b = c0962gp;
/* 10 */            this.f12645c = qc3.m7762j(c0962gp);
/* 18 */            int[] iArr = (int[]) c0962gp.m3981a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 20 */            boolean z = false;
/* 21 */            if (iArr != null) {
/* 25 */                for (int i : iArr) {
/* 31 */                    if (i == 18) {
/* 33 */                        z = true;
                                break;
                            }
                        }
                    }
/* 38 */            this.f12643a = z;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m6003b(mb0 mb0Var, mb0 mb0Var2) {
/* 1 */             boolean zM6635b = mb0Var2.m6635b();
/* 5 */             int i = mb0Var2.f13677a;
/* 9 */             de3.m3028j("Fully specified range is not actually fully specified.", zM6635b);
/* 12 */            int i2 = mb0Var.f13677a;
/* 16 */            if (i2 == 2 && i == 1) {
/* 37 */                return false;
                    }
/* 21 */            if (i2 != 2 && i2 != 0 && i2 != i) {
/* 37 */                return false;
                    }
/* 28 */            int i3 = mb0Var.f13678b;
                    return i3 == 0 || i3 == mb0Var2.f13678b;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m6004c(mb0 mb0Var, mb0 mb0Var2, HashSet hashSet) {
/* 5 */             if (hashSet.contains(mb0Var2)) {
/* 20 */                return m6003b(mb0Var, mb0Var2);
                    }
/* 7 */             mb0Var.toString();
/* 10 */            mb0Var2.toString();
/* 15 */            hu0.m4312F0("DynamicRangeResolver");
/* 18 */            return false;
                }

                /* JADX INFO: renamed from: i */
                public static mb0 m6005i(mb0 mb0Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
/* 4 */             if (mb0Var.f13677a == 1) {
/* 49 */                return null;
                    }
/* 7 */             Iterator it = linkedHashSet.iterator();
/* 15 */            while (it.hasNext()) {
/* 21 */                mb0 mb0Var2 = (mb0) it.next();
/* 25 */                de3.m3027i(mb0Var2, "Fully specified DynamicRange cannot be null.");
/* 28 */                int i = mb0Var2.f13677a;
/* 36 */                de3.m3028j("Fully specified DynamicRange must have fully defined encoding.", mb0Var2.m6635b());
/* 39 */                if (i != 1 && m6004c(mb0Var, mb0Var2, hashSet)) {
/* 48 */                    return mb0Var2;
                        }
                    }
/* 49 */            return null;
                }

                /* JADX INFO: renamed from: l */
                public static void m6006l(BufferedInputStream bufferedInputStream, long j) {
/* 5 */             while (j > 0) {
/* 7 */                 long jSkip = bufferedInputStream.skip(j);
/* 13 */                if (jSkip != 0) {
/* 34 */                    j -= jSkip;
                        } else {
/* 20 */                    if (bufferedInputStream.read() == -1) {
/* 33 */                        throw new EOFException("Unexpected end of stream while skipping bytes");
                            }
/* 24 */                    j--;
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public static void m6007m(HashSet hashSet, mb0 mb0Var, qc3 qc3Var) {
/* 9 */             de3.m3028j("Cannot update already-empty constraints.", !hashSet.isEmpty());
/* 16 */            Set setMo7382c = ((pb0) qc3Var.f15492b).mo7382c(mb0Var);
/* 24 */            if (setMo7382c.isEmpty()) {
/* 61 */                return;
                    }
/* 28 */            HashSet hashSet2 = new HashSet(hashSet);
/* 31 */            hashSet.retainAll(setMo7382c);
/* 38 */            if (hashSet.isEmpty()) {
/* 58 */                s80.m8427h("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", mb0Var, "\nConstraints:\n  ", TextUtils.join("\n  ", setMo7382c), "\nExisting constraints:\n  ", TextUtils.join("\n  ", hashSet2));
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: a */
                public int mo3809a() {
                    int imageFormat;
                    synchronized (this.f12645c) {
/* 8 */                 imageFormat = ((ImageReader) this.f12644b).getImageFormat();
                    }
/* 13 */            return imageFormat;
                }

                @Override // p000.ow0
                public mw0 acquireLatestImage() {
                    Image imageAcquireLatestImage;
                    synchronized (this.f12645c) {
                        try {
/* 9 */                     imageAcquireLatestImage = ((ImageReader) this.f12644b).acquireLatestImage();
                        } catch (RuntimeException e) {
/* 27 */                    if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
/* 41 */                        throw e;
                            }
/* 29 */                    imageAcquireLatestImage = null;
                        }
/* 30 */                if (imageAcquireLatestImage == null) {
/* 4 */                     return null;
                        }
/* 36 */                return new C0982h8(imageAcquireLatestImage);
                    }
                }

                @Override // p000.ow0
                public void close() {
                    synchronized (this.f12645c) {
/* 8 */                 ((ImageReader) this.f12644b).close();
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: d */
                public void mo3810d() {
                    synchronized (this.f12645c) {
/* 5 */                 this.f12643a = true;
/* 12 */                ((ImageReader) this.f12644b).setOnImageAvailableListener(null, null);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0011, B:6:0x001d, B:8:0x0025, B:21:0x0058, B:13:0x0038, B:15:0x0040, B:18:0x0047, B:20:0x004f, B:24:0x005f, B:27:0x0069), top: B:50:0x0011, outer: #4 }] */
                /* JADX INFO: renamed from: e */
                public C1175b1 m6008e(BufferedInputStream bufferedInputStream, int i, File file) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f12644b;
/* 5 */             C1175b1 c1175b1 = null;
                    try {
/* 8 */                 C1165a1 c1165a1 = new C1165a1(bufferedInputStream, i);
                        try {
/* 15 */                    InputStreamReader inputStreamReader = new InputStreamReader(c1165a1, StandardCharsets.UTF_8);
                            try {
/* 20 */                        C1446f2 c1446f2 = new C1446f2(inputStreamReader);
/* 23 */                        C1730a c1730a = c1446f2.f10936a;
/* 25 */                        c1446f2.beginObject();
/* 28 */                        String strMo5231M = null;
/* 29 */                        Date dateMo5241l0 = null;
/* 36 */                        while (c1730a.peek() == EnumC1731b.NAME) {
/* 38 */                            String strNextName = c1730a.nextName();
/* 42 */                            int iHashCode = strNextName.hashCode();
/* 49 */                            if (iHashCode != 55126294) {
/* 54 */                                if (iHashCode == 1874684019 && strNextName.equals("platform")) {
/* 65 */                                    strMo5231M = c1446f2.mo5231M();
                                        } else {
/* 89 */                                    c1446f2.skipValue();
                                        }
                                    } else if (strNextName.equals("timestamp")) {
/* 84 */                                dateMo5241l0 = c1446f2.mo5241l0(sentryAndroidOptions.getLogger());
                                    } else {
/* 89 */                                c1446f2.skipValue();
                                    }
/* 92 */                            if (strMo5231M != null && dateMo5241l0 != null) {
                                        break;
                                    }
                                }
/* 102 */                       if ("native".equals(strMo5231M) && dateMo5241l0 != null) {
/* 112 */                           c1175b1 = new C1175b1(file, dateMo5241l0.getTime());
                                }
/* 116 */                       inputStreamReader.close();
/* 119 */                       c1165a1.close();
/* 122 */                       return c1175b1;
                            } catch (Throwable th) {
                                try {
/* 127 */                           inputStreamReader.close();
                                } catch (Throwable th2) {
/* 132 */                           th.addSuppressed(th2);
                                }
/* 135 */                       throw th;
                            }
                        } catch (Throwable th3) {
                            try {
/* 136 */                       c1165a1.close();
                            } catch (Throwable th4) {
/* 141 */                       th3.addSuppressed(th4);
                            }
/* 144 */                   throw th3;
                        }
                    } catch (Throwable th5) {
/* 161 */               sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.DEBUG, th5, "Error parsing event JSON from: %s", file.getName());
/* 5 */                 return null;
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: f */
                public void mo3811f(final nw0 nw0Var, final Executor executor) {
                    synchronized (this.f12645c) {
/* 5 */                 this.f12643a = false;
/* 20 */                ((ImageReader) this.f12644b).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: i8
                            @Override // android.media.ImageReader.OnImageAvailableListener
                            public final void onImageAvailable(ImageReader imageReader) {
/* 1 */                         C1822k8 c1822k8 = this.f9493a;
/* 3 */                         Executor executor2 = executor;
/* 5 */                         nw0 nw0Var2 = nw0Var;
                                synchronized (c1822k8.f12645c) {
                                    try {
/* 12 */                                if (!c1822k8.f12643a) {
/* 20 */                                    executor2.execute(new RunnableC1784j8(0, c1822k8, nw0Var2));
                                        }
                                    } catch (Throwable th) {
/* 29 */                                throw th;
                                    }
                                }
                            }
                        }, jb1.m5757q());
                    }
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: g */
                public int mo3812g() {
                    int maxImages;
                    synchronized (this.f12645c) {
/* 8 */                 maxImages = ((ImageReader) this.f12644b).getMaxImages();
                    }
/* 13 */            return maxImages;
                }

                @Override // p000.ow0
                public int getHeight() {
                    int height;
                    synchronized (this.f12645c) {
/* 8 */                 height = ((ImageReader) this.f12644b).getHeight();
                    }
/* 13 */            return height;
                }

                @Override // p000.ow0
                public Surface getSurface() {
                    Surface surface;
                    synchronized (this.f12645c) {
/* 8 */                 surface = ((ImageReader) this.f12644b).getSurface();
                    }
/* 13 */            return surface;
                }

                @Override // p000.ow0
                public int getWidth() {
                    int width;
                    synchronized (this.f12645c) {
/* 8 */                 width = ((ImageReader) this.f12644b).getWidth();
                    }
/* 13 */            return width;
                }

                @Override // p000.ow0
                /* JADX INFO: renamed from: h */
                public mw0 mo3813h() {
                    Image imageAcquireNextImage;
                    synchronized (this.f12645c) {
                        try {
/* 9 */                     imageAcquireNextImage = ((ImageReader) this.f12644b).acquireNextImage();
                        } catch (RuntimeException e) {
/* 27 */                    if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
/* 41 */                        throw e;
                            }
/* 29 */                    imageAcquireNextImage = null;
                        }
/* 30 */                if (imageAcquireNextImage == null) {
/* 4 */                     return null;
                        }
/* 36 */                return new C0982h8(imageAcquireNextImage);
                    }
                }

                /* JADX INFO: renamed from: j */
                public Properties m6009j() {
/* 3 */             C1535l2 c1535l2 = (C1535l2) this.f12645c;
/* 7 */             String str = (String) this.f12644b;
                    try {
/* 16 */                File file = new File(str.trim());
/* 23 */                if (!file.isFile() || !file.canRead()) {
/* 69 */                    if (file.isFile()) {
/* 91 */                        if (!file.canRead()) {
/* 101 */                           c1535l2.mo4672k(EnumC1553m5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                                }
                            } else if (this.f12643a) {
/* 83 */                        c1535l2.mo4672k(EnumC1553m5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
/* 9 */                         return null;
                            }
/* 9 */                     return null;
                        }
/* 38 */                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
/* 43 */                    Properties properties = new Properties();
/* 46 */                    properties.load(bufferedInputStream);
/* 49 */                    bufferedInputStream.close();
/* 52 */                    return properties;
                        } catch (Throwable th) {
                            try {
/* 56 */                        bufferedInputStream.close();
                            } catch (Throwable th2) {
/* 61 */                        th.addSuppressed(th2);
                            }
/* 64 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 113 */               c1535l2.mo4670b(EnumC1553m5.ERROR, th3, "Failed to load Sentry configuration from file: %s", str);
/* 9 */                 return null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0025, B:20:0x0054, B:12:0x0038, B:14:0x0040, B:17:0x0047, B:19:0x004f, B:24:0x005d), top: B:40:0x0011, outer: #2 }] */
                /* JADX INFO: renamed from: k */
                public C1795jj m6010k(String str) {
                    try {
/* 6 */                 Charset charset = StandardCharsets.UTF_8;
/* 15 */                InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
                        try {
/* 20 */                    C1446f2 c1446f2 = new C1446f2(inputStreamReader);
/* 23 */                    C1730a c1730a = c1446f2.f10936a;
/* 25 */                    c1446f2.beginObject();
/* 28 */                    int iNextInt = -1;
/* 29 */                    String strMo5231M = null;
/* 36 */                    while (c1730a.peek() == EnumC1731b.NAME) {
/* 38 */                        String strNextName = c1730a.nextName();
/* 42 */                        int iHashCode = strNextName.hashCode();
/* 49 */                        if (iHashCode != -1106363674) {
/* 54 */                            if (iHashCode == 3575610 && strNextName.equals("type")) {
/* 65 */                                strMo5231M = c1446f2.mo5231M();
                                    } else {
/* 85 */                                c1446f2.skipValue();
                                    }
                                } else if (strNextName.equals("length")) {
/* 80 */                            iNextInt = c1446f2.nextInt();
                                } else {
/* 85 */                            c1446f2.skipValue();
                                }
/* 88 */                        if (strMo5231M != null && iNextInt >= 0) {
                                    break;
                                }
                            }
/* 92 */                    if (iNextInt < 0) {
/* 109 */                       inputStreamReader.close();
/* 1 */                         return null;
                            }
/* 96 */                    C1795jj c1795jj = new C1795jj();
/* 99 */                    c1795jj.f12325b = strMo5231M;
/* 101 */                   c1795jj.f12324a = iNextInt;
/* 103 */                   inputStreamReader.close();
/* 106 */                   return c1795jj;
                        } catch (Throwable th) {
                            try {
/* 113 */                       inputStreamReader.close();
                            } catch (Throwable th2) {
/* 118 */                       th.addSuppressed(th2);
                            }
/* 121 */                   throw th;
                        }
                    } catch (Throwable th3) {
/* 137 */               ((SentryAndroidOptions) this.f12644b).getLogger().mo4670b(EnumC1553m5.DEBUG, th3, "Error parsing item header", new Object[0]);
/* 1 */                 return null;
                    }
/* 137 */           ((SentryAndroidOptions) this.f12644b).getLogger().mo4670b(EnumC1553m5.DEBUG, th3, "Error parsing item header", new Object[0]);
/* 1 */             return null;
                }

/* 40 */        public C1822k8(SentryAndroidOptions sentryAndroidOptions) {
/* 42 */            this.f12645c = new ArrayList();
/* 43 */            this.f12643a = false;
/* 44 */            this.f12644b = sentryAndroidOptions;
                }

/* 44 */        public C1822k8(ImageReader imageReader) {
/* 46 */            this.f12645c = new Object();
/* 47 */            this.f12643a = true;
/* 48 */            this.f12644b = imageReader;
                }

/* 48 */        public C1822k8(Executor executor) {
/* 49 */            er0 er0Var = e80.f7571a;
/* 51 */            if (e80.f7571a.m3582h(LowMemoryQuirk.class) != null) {
/* 54 */                this.f12644b = new y92(executor);
                    } else {
/* 55 */                this.f12644b = executor;
                    }
/* 56 */            this.f12645c = er0Var;
/* 57 */            this.f12643a = er0Var.m3579d(IncorrectJpegMetadataQuirk.class);
                }

/* 57 */        public C1822k8(String str, C1535l2 c1535l2, boolean z) {
/* 59 */            this.f12644b = str;
/* 60 */            this.f12645c = c1535l2;
/* 61 */            this.f12643a = z;
                }
            }
