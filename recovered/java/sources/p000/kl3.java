            package p000;

            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class kl3 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f12876a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f12877b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ al3 f12878c;

                public /* synthetic */ kl3(boolean z, String str, al3 al3Var) {
/* 4 */             this.f12876a = z;
/* 6 */             this.f12877b = str;
/* 8 */             this.f12878c = al3Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    MessageDigest messageDigest;
/* 1 */             boolean z = this.f12876a;
/* 3 */             String str = this.f12877b;
/* 5 */             al3 al3Var = this.f12878c;
/* 22 */            String str2 = (z || !ko3.m6173b(str, al3Var, true, false).f20311b) ? "not allowed" : "debug cert rejected";
/* 26 */            int i = 0;
                    while (true) {
/* 28 */                if (i >= 2) {
/* 39 */                    messageDigest = null;
                            break;
                        }
                        try {
/* 30 */                    messageDigest = MessageDigest.getInstance("SHA-256");
/* 34 */                    if (messageDigest != null) {
                                break;
                            }
/* 36 */                    i++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
/* 40 */            kb1.m6061n(messageDigest);
/* 45 */            byte[] bArrDigest = messageDigest.digest(al3Var.f330c);
/* 49 */            int length = bArrDigest.length;
/* 51 */            char[] cArr = new char[length + length];
/* 53 */            int i2 = 0;
/* 55 */            for (byte b : bArrDigest) {
/* 63 */                char[] cArr2 = i13.f9401d;
/* 69 */                cArr[i2] = cArr2[(b & 255) >>> 4];
/* 75 */                cArr[i2 + 1] = cArr2[b & 15];
/* 77 */                i2 += 2;
                    }
/* 123 */           return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
                }
            }
