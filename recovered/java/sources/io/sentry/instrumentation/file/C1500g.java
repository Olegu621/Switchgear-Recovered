            package io.sentry.instrumentation.file;

            import io.sentry.AbstractC1552m4;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.util.AbstractC1712k;
            import java.io.File;
            import java.io.FileDescriptor;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import p000.C2076pn;
            
            /* JADX INFO: renamed from: io.sentry.instrumentation.file.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C1500g extends FileOutputStream {

                /* JADX INFO: renamed from: a */
                public final FileOutputStream f11034a;

                /* JADX INFO: renamed from: b */
                public final C1495b f11035b;

                /* JADX WARN: Illegal instructions before constructor call */
                public C1500g(C1496c c1496c) throws FileNotFoundException {
/* 3 */             FileOutputStream fileOutputStream = (FileOutputStream) c1496c.f11024d;
                    try {
/* 9 */                 super(fileOutputStream.getFD());
/* 23 */                this.f11035b = new C1495b(c1496c.f11022b, c1496c.f11021a, c1496c.f11023c);
/* 25 */                this.f11034a = fileOutputStream;
                    } catch (IOException unused) {
/* 35 */                throw new FileNotFoundException("No file descriptor");
                    }
                }

                /* JADX INFO: renamed from: c */
                public static C1496c m5284c(File file, FileOutputStream fileOutputStream, boolean z) {
/* 18 */            InterfaceC1525k1 interfaceC1525k1Mo5093m = AbstractC1712k.f11736a ? AbstractC1552m4.m5357b().mo5093m() : AbstractC1552m4.m5357b().mo5087g();
/* 42 */            return new C1496c(file, interfaceC1525k1Mo5093m != null ? interfaceC1525k1Mo5093m.mo4735p("file.write") : null, fileOutputStream, AbstractC1552m4.m5357b().mo5092l());
                }

                @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 5 */             this.f11035b.m5280a(this.f11034a);
/* 8 */             super.close();
                }

                @Override // java.io.FileOutputStream, java.io.OutputStream
                public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 13 */            this.f11035b.m5282c(new C1497d(this, bArr, i, i2, 1));
                }

                @Override // java.io.FileOutputStream, java.io.OutputStream
/* 16 */        public final void write(byte[] bArr) throws IOException {
/* 17 */            this.f11035b.m5282c(new C2076pn(28, this, bArr));
                }

                @Override // java.io.FileOutputStream, java.io.OutputStream
/* 17 */        public final void write(final int i) throws IOException {
/* 18 */            this.f11035b.m5282c(new InterfaceC1494a() { // from class: io.sentry.instrumentation.file.f
                        @Override // io.sentry.instrumentation.file.InterfaceC1494a
                        public final Object call() throws IOException {
/* 7 */                     this.f11032a.f11034a.write(i);
/* 11 */                    return 1;
                        }
                    });
                }

/* 35 */        public C1500g(C1496c c1496c, FileDescriptor fileDescriptor) {
/* 36 */            super(fileDescriptor);
/* 37 */            this.f11035b = new C1495b(c1496c.f11022b, c1496c.f11021a, c1496c.f11023c);
/* 38 */            this.f11034a = (FileOutputStream) c1496c.f11024d;
                }
            }
