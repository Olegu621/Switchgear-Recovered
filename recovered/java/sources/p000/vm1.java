            package p000;

            import android.util.SparseArray;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vm1 {

                /* JADX INFO: renamed from: a */
                public static final SparseArray f18248a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ vm1[] f18249b;

                /* JADX INFO: Fake field, exist only in values array */
                vm1 EF1;

                static {
/* 6 */             vm1 vm1Var = new vm1("UNKNOWN_MOBILE_SUBTYPE", 0);
/* 15 */            vm1 vm1Var2 = new vm1("GPRS", 1);
/* 23 */            vm1 vm1Var3 = new vm1("EDGE", 2);
/* 32 */            vm1 vm1Var4 = new vm1("UMTS", 3);
/* 41 */            vm1 vm1Var5 = new vm1("CDMA", 4);
/* 50 */            vm1 vm1Var6 = new vm1("EVDO_0", 5);
/* 59 */            vm1 vm1Var7 = new vm1("EVDO_A", 6);
/* 68 */            vm1 vm1Var8 = new vm1("RTT", 7);
/* 78 */            vm1 vm1Var9 = new vm1("HSDPA", 8);
/* 87 */            vm1 vm1Var10 = new vm1("HSUPA", 9);
/* 96 */            vm1 vm1Var11 = new vm1("HSPA", 10);
/* 105 */           vm1 vm1Var12 = new vm1("IDEN", 11);
/* 114 */           vm1 vm1Var13 = new vm1("EVDO_B", 12);
/* 123 */           vm1 vm1Var14 = new vm1("LTE", 13);
/* 134 */           vm1 vm1Var15 = new vm1("EHRPD", 14);
/* 145 */           vm1 vm1Var16 = new vm1("HSPAP", 15);
/* 156 */           vm1 vm1Var17 = new vm1("GSM", 16);
/* 167 */           vm1 vm1Var18 = new vm1("TD_SCDMA", 17);
/* 178 */           vm1 vm1Var19 = new vm1("IWLAN", 18);
/* 189 */           vm1 vm1Var20 = new vm1("LTE_CA", 19);
/* 234 */           f18249b = new vm1[]{vm1Var, vm1Var2, vm1Var3, vm1Var4, vm1Var5, vm1Var6, vm1Var7, vm1Var8, vm1Var9, vm1Var10, vm1Var11, vm1Var12, vm1Var13, vm1Var14, vm1Var15, vm1Var16, vm1Var17, vm1Var18, vm1Var19, vm1Var20, new vm1("COMBINED", 20)};
/* 238 */           SparseArray sparseArray = new SparseArray();
/* 241 */           f18248a = sparseArray;
/* 246 */           sparseArray.put(0, vm1Var);
/* 250 */           sparseArray.put(1, vm1Var2);
/* 254 */           sparseArray.put(2, vm1Var3);
/* 258 */           sparseArray.put(3, vm1Var4);
/* 262 */           sparseArray.put(4, vm1Var5);
/* 266 */           sparseArray.put(5, vm1Var6);
/* 270 */           sparseArray.put(6, vm1Var7);
/* 274 */           sparseArray.put(7, vm1Var8);
/* 279 */           sparseArray.put(8, vm1Var9);
/* 284 */           sparseArray.put(9, vm1Var10);
/* 289 */           sparseArray.put(10, vm1Var11);
/* 294 */           sparseArray.put(11, vm1Var12);
/* 299 */           sparseArray.put(12, vm1Var13);
/* 304 */           sparseArray.put(13, vm1Var14);
/* 311 */           sparseArray.put(14, vm1Var15);
/* 318 */           sparseArray.put(15, vm1Var16);
/* 325 */           sparseArray.put(16, vm1Var17);
/* 332 */           sparseArray.put(17, vm1Var18);
/* 339 */           sparseArray.put(18, vm1Var19);
/* 346 */           sparseArray.put(19, vm1Var20);
                }

                public static vm1 valueOf(String str) {
/* 7 */             return (vm1) Enum.valueOf(vm1.class, str);
                }

                public static vm1[] values() {
/* 7 */             return (vm1[]) f18249b.clone();
                }
            }
