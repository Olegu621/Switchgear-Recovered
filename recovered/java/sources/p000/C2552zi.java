            package p000;
            
            /* JADX INFO: renamed from: zi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2552zi {

                /* JADX INFO: renamed from: e */
                public static final byte[] f20154e = new byte[1792];

                /* JADX INFO: renamed from: a */
                public final CharSequence f20155a;

                /* JADX INFO: renamed from: b */
                public final int f20156b;

                /* JADX INFO: renamed from: c */
                public int f20157c;

                /* JADX INFO: renamed from: d */
                public char f20158d;

                static {
/* 8 */             for (int i = 0; i < 1792; i++) {
/* 16 */                f20154e[i] = Character.getDirectionality(i);
                    }
                }

                public C2552zi(CharSequence charSequence) {
/* 4 */             this.f20155a = charSequence;
/* 10 */            this.f20156b = charSequence.length();
                }

                /* JADX INFO: renamed from: a */
                public final byte m10355a() {
/* 3 */             int i = this.f20157c - 1;
/* 5 */             CharSequence charSequence = this.f20155a;
/* 7 */             char cCharAt = charSequence.charAt(i);
/* 11 */            this.f20158d = cCharAt;
/* 13 */            boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
/* 17 */            int i2 = this.f20157c;
/* 19 */            if (zIsLowSurrogate) {
/* 21 */                int iCodePointBefore = Character.codePointBefore(charSequence, i2);
/* 32 */                this.f20157c -= Character.charCount(iCodePointBefore);
/* 34 */                return Character.getDirectionality(iCodePointBefore);
                    }
/* 41 */            this.f20157c = i2 - 1;
/* 43 */            char c = this.f20158d;
                    return c < 1792 ? f20154e[c] : Character.getDirectionality(c);
                }
            }
