            package io.sentry.instrumentation.file;

            import java.io.Closeable;
            import java.io.IOException;
            
            /* JADX INFO: renamed from: io.sentry.instrumentation.file.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1497d implements InterfaceC1494a {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11025a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ byte[] f11026b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f11027c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f11028d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Closeable f11029e;

                public /* synthetic */ C1497d(Closeable closeable, byte[] bArr, int i, int i2, int i3) {
/* 1 */             this.f11025a = i3;
/* 3 */             this.f11029e = closeable;
/* 5 */             this.f11026b = bArr;
/* 7 */             this.f11027c = i;
/* 9 */             this.f11028d = i2;
                }

                @Override // io.sentry.instrumentation.file.InterfaceC1494a
                public final Object call() throws IOException {
/* 1 */             int i = this.f11025a;
/* 3 */             int i2 = this.f11028d;
/* 5 */             int i3 = this.f11027c;
/* 7 */             byte[] bArr = this.f11026b;
/* 9 */             Closeable closeable = this.f11029e;
                    switch (i) {
                        case 0:
/* 34 */                    return Integer.valueOf(((C1498e) closeable).f11030a.read(bArr, i3, i2));
                        default:
/* 18 */                    ((C1500g) closeable).f11034a.write(bArr, i3, i2);
/* 21 */                    return Integer.valueOf(i2);
                    }
                }
            }
