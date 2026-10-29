            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public final class i63 {

                /* JADX INFO: renamed from: a */
                public final l63[] f9472a;

                /* JADX INFO: renamed from: b */
                public final String f9473b;

                /* JADX INFO: renamed from: c */
                public final byte[] f9474c;

                /* JADX INFO: renamed from: d */
                public final int f9475d;

                public i63(byte[] bArr, l63[] l63VarArr) {
/* 4 */             Objects.requireNonNull(bArr);
/* 7 */             this.f9474c = bArr;
/* 10 */            this.f9473b = null;
/* 12 */            this.f9472a = l63VarArr;
/* 15 */            this.f9475d = 1;
                }

                /* JADX INFO: renamed from: a */
                public final void m4482a(int i) {
                    String str;
/* 1 */             int i2 = this.f9475d;
/* 3 */             if (i == i2) {
/* 5 */                 return;
                    }
/* 12 */            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
/* 15 */            String str2 = "String";
/* 22 */            if (i2 != 0) {
/* 24 */                str = i2 != 1 ? "Unknown" : "ArrayBuffer";
                    } else {
/* 15 */                str = "String";
                    }
/* 31 */            sb.append(str);
/* 36 */            sb.append(" expected, but got ");
/* 39 */            if (i != 0) {
/* 41 */                str2 = i != 1 ? "Unknown" : "ArrayBuffer";
                    }
/* 46 */            sb.append(str2);
/* 56 */            throw new IllegalStateException(sb.toString());
                }

/* 17 */        public i63(String str, l63[] l63VarArr) {
/* 19 */            this.f9473b = str;
/* 20 */            this.f9474c = null;
/* 21 */            this.f9472a = l63VarArr;
/* 22 */            this.f9475d = 0;
                }
            }
