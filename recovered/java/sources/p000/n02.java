            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class n02 {

                /* JADX INFO: renamed from: a */
                public static final m02 f14089a = new m02(null);

                /* JADX INFO: renamed from: b */
                public static final AbstractC0199c0 f14090b;

                static {
/* 9 */             Integer num = b01.f2152b;
/* 33 */            f14090b = (num == null || num.intValue() >= 34) ? new at1() : new vg0();
                }

                /* JADX INFO: renamed from: a */
                public abstract int mo1470a(int i);

                /* JADX INFO: renamed from: b */
                public int mo1471b() {
/* 3 */             return mo1470a(32);
                }

                /* JADX INFO: renamed from: c */
                public int mo1167c() {
                    int iMo1471b;
                    int i;
/* 12 */            do {
/* 5 */                 iMo1471b = mo1471b() >>> 1;
/* 7 */                 i = iMo1471b % 10000;
/* 12 */            } while ((iMo1471b - i) + 9999 < 0);
/* 14 */            return i;
                }
            }
