            package com.quago.mobile.sdk;

            import java.security.SecureRandom;
            import java.util.Locale;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.c1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 31 */    public final class C0720c1 {

                /* JADX INFO: renamed from: d */
                public static final String f5367d = fm0.m3784j("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase(Locale.ROOT), "0123456789");

                /* JADX INFO: renamed from: a */
                public final char[] f5368a;

                /* JADX INFO: renamed from: b */
                public final char[] f5369b;

                /* JADX INFO: renamed from: c */
                public final SecureRandom f5370c;

                public C0720c1(SecureRandom secureRandom, String str) {
/* 9 */             if (str.length() < 2) {
/* 28 */                C1951n4.m6859j("allowed characters must include at least 2 characters");
/* 32 */                throw null;
                    }
/* 15 */            this.f5368a = str.toCharArray();
/* 21 */            this.f5369b = new char[36];
/* 23 */            this.f5370c = secureRandom;
                }

                /* JADX INFO: renamed from: a */
                public final String m2551a() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 char[] cArr = this.f5369b;
/* 5 */                 if (i >= cArr.length) {
/* 26 */                    return new String(cArr);
                        }
/* 9 */                 char[] cArr2 = this.f5368a;
/* 20 */                cArr[i] = cArr2[this.f5370c.nextInt(cArr2.length)];
/* 7 */                 i++;
                    }
                }

/* 32 */        public C0720c1() {
/* 33 */            this(new SecureRandom(), f5367d);
                }
            }
