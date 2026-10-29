            package p000;

            import io.sentry.config.AbstractC1417a;
            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fy1 {

                /* JADX INFO: renamed from: a */
                public final int f8396a;

                /* JADX INFO: renamed from: b */
                public final int f8397b;

                /* JADX INFO: renamed from: c */
                public final long f8398c;

                /* JADX INFO: renamed from: d */
                public final long f8399d;

                public fy1(int i, int i2, long j, long j2) {
/* 4 */             this.f8396a = i;
/* 6 */             this.f8397b = i2;
/* 8 */             this.f8398c = j;
/* 10 */            this.f8399d = j2;
                }

                /* JADX INFO: renamed from: a */
                public static fy1 m3854a(File file) throws IOException {
/* 12 */            DataInputStream dataInputStream = new DataInputStream(AbstractC1417a.m5164b(file, new FileInputStream(file)));
                    try {
/* 33 */                fy1 fy1Var = new fy1(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
/* 36 */                dataInputStream.close();
/* 39 */                return fy1Var;
                    } catch (Throwable th) {
                        try {
/* 42 */                    dataInputStream.close();
/* 50 */                    throw th;
                        } catch (Throwable th2) {
/* 47 */                    th.addSuppressed(th2);
/* 50 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m3855b(File file) throws IOException {
/* 1 */             file.delete();
/* 15 */            DataOutputStream dataOutputStream = new DataOutputStream(AbstractC1417a.m5167e(new FileOutputStream(file), file));
                    try {
/* 20 */                dataOutputStream.writeInt(this.f8396a);
/* 25 */                dataOutputStream.writeInt(this.f8397b);
/* 30 */                dataOutputStream.writeLong(this.f8398c);
/* 35 */                dataOutputStream.writeLong(this.f8399d);
/* 38 */                dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 43 */                    dataOutputStream.close();
                        } catch (Throwable th2) {
/* 48 */                    th.addSuppressed(th2);
                        }
/* 51 */                throw th;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && (obj instanceof fy1)) {
/* 13 */                fy1 fy1Var = (fy1) obj;
/* 19 */                if (this.f8397b == fy1Var.f8397b && this.f8398c == fy1Var.f8398c && this.f8396a == fy1Var.f8396a && this.f8399d == fy1Var.f8399d) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 29 */            return Objects.hash(Integer.valueOf(this.f8397b), Long.valueOf(this.f8398c), Integer.valueOf(this.f8396a), Long.valueOf(this.f8399d));
                }
            }
