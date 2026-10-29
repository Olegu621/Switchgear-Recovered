            package io.sentry.instrumentation.file;

            import io.sentry.AbstractC1552m4;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.util.AbstractC1712k;
            import java.io.File;
            import java.io.FileDescriptor;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.C2076pn;
            import p000.p52;
            
            /* JADX INFO: renamed from: io.sentry.instrumentation.file.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public final class C1498e extends FileInputStream {

                /* JADX INFO: renamed from: a */
                public final FileInputStream f11030a;

                /* JADX INFO: renamed from: b */
                public final C1495b f11031b;

                /* JADX WARN: Illegal instructions before constructor call */
                public C1498e(C1496c c1496c) throws FileNotFoundException {
/* 3 */             FileInputStream fileInputStream = (FileInputStream) c1496c.f11024d;
                    try {
/* 9 */                 super(fileInputStream.getFD());
/* 23 */                this.f11031b = new C1495b(c1496c.f11022b, c1496c.f11021a, c1496c.f11023c);
/* 25 */                this.f11030a = fileInputStream;
                    } catch (IOException unused) {
/* 35 */                throw new FileNotFoundException("No file descriptor");
                    }
                }

                /* JADX INFO: renamed from: c */
                public static C1496c m5283c(File file, FileInputStream fileInputStream) {
/* 18 */            InterfaceC1525k1 interfaceC1525k1Mo5093m = AbstractC1712k.f11736a ? AbstractC1552m4.m5357b().mo5093m() : AbstractC1552m4.m5357b().mo5087g();
/* 31 */            InterfaceC1525k1 interfaceC1525k1Mo4735p = interfaceC1525k1Mo5093m != null ? interfaceC1525k1Mo5093m.mo4735p("file.read") : null;
/* 32 */            if (fileInputStream == null) {
/* 36 */                fileInputStream = new FileInputStream(file);
                    }
/* 49 */            return new C1496c(file, interfaceC1525k1Mo4735p, fileInputStream, AbstractC1552m4.m5357b().mo5092l());
                }

                @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 5 */             this.f11031b.m5280a(this.f11030a);
/* 8 */             super.close();
                }

                @Override // java.io.FileInputStream, java.io.InputStream
                public final int read() throws IOException {
/* 4 */             AtomicInteger atomicInteger = new AtomicInteger(0);
/* 16 */            this.f11031b.m5282c(new C2076pn(27, this, atomicInteger));
/* 19 */            return atomicInteger.get();
                }

                @Override // java.io.FileInputStream, java.io.InputStream
                public final long skip(long j) {
/* 14 */            return ((Long) this.f11031b.m5282c(new p52(this, j))).longValue();
                }

                @Override // java.io.FileInputStream, java.io.InputStream
/* 23 */        public final int read(byte[] bArr) {
                    return ((Integer) this.f11031b.m5282c(new C2076pn(26, this, bArr))).intValue();
                }

                @Override // java.io.FileInputStream, java.io.InputStream
/* 24 */        public final int read(byte[] bArr, int i, int i2) {
                    return ((Integer) this.f11031b.m5282c(new C1497d(this, bArr, i, i2, 0))).intValue();
                }

/* 35 */        public C1498e(C1496c c1496c, FileDescriptor fileDescriptor) {
/* 36 */            super(fileDescriptor);
/* 37 */            this.f11031b = new C1495b(c1496c.f11022b, c1496c.f11021a, c1496c.f11023c);
/* 38 */            this.f11030a = (FileInputStream) c1496c.f11024d;
                }

/* 38 */        public C1498e(File file) {
/* 39 */            this(m5283c(file, null));
                }
            }
