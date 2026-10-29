            package p000;

            import android.util.SparseArray;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wm1 {

                /* JADX INFO: renamed from: a */
                public static final SparseArray f18687a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ wm1[] f18688b;

                /* JADX INFO: Fake field, exist only in values array */
                wm1 EF1;

                static {
/* 6 */             wm1 wm1Var = new wm1("MOBILE", 0);
/* 15 */            wm1 wm1Var2 = new wm1("WIFI", 1);
/* 23 */            wm1 wm1Var3 = new wm1("MOBILE_MMS", 2);
/* 32 */            wm1 wm1Var4 = new wm1("MOBILE_SUPL", 3);
/* 41 */            wm1 wm1Var5 = new wm1("MOBILE_DUN", 4);
/* 50 */            wm1 wm1Var6 = new wm1("MOBILE_HIPRI", 5);
/* 59 */            wm1 wm1Var7 = new wm1("WIMAX", 6);
/* 68 */            wm1 wm1Var8 = new wm1("BLUETOOTH", 7);
/* 78 */            wm1 wm1Var9 = new wm1("DUMMY", 8);
/* 87 */            wm1 wm1Var10 = new wm1("ETHERNET", 9);
/* 96 */            wm1 wm1Var11 = new wm1("MOBILE_FOTA", 10);
/* 105 */           wm1 wm1Var12 = new wm1("MOBILE_IMS", 11);
/* 114 */           wm1 wm1Var13 = new wm1("MOBILE_CBS", 12);
/* 123 */           wm1 wm1Var14 = new wm1("WIFI_P2P", 13);
/* 134 */           wm1 wm1Var15 = new wm1("MOBILE_IA", 14);
/* 145 */           wm1 wm1Var16 = new wm1("MOBILE_EMERGENCY", 15);
/* 156 */           wm1 wm1Var17 = new wm1("PROXY", 16);
/* 167 */           wm1 wm1Var18 = new wm1("VPN", 17);
/* 178 */           wm1 wm1Var19 = new wm1("NONE", 18);
/* 206 */           f18688b = new wm1[]{wm1Var, wm1Var2, wm1Var3, wm1Var4, wm1Var5, wm1Var6, wm1Var7, wm1Var8, wm1Var9, wm1Var10, wm1Var11, wm1Var12, wm1Var13, wm1Var14, wm1Var15, wm1Var16, wm1Var17, wm1Var18, wm1Var19};
/* 210 */           SparseArray sparseArray = new SparseArray();
/* 213 */           f18687a = sparseArray;
/* 218 */           sparseArray.put(0, wm1Var);
/* 222 */           sparseArray.put(1, wm1Var2);
/* 226 */           sparseArray.put(2, wm1Var3);
/* 230 */           sparseArray.put(3, wm1Var4);
/* 234 */           sparseArray.put(4, wm1Var5);
/* 238 */           sparseArray.put(5, wm1Var6);
/* 242 */           sparseArray.put(6, wm1Var7);
/* 246 */           sparseArray.put(7, wm1Var8);
/* 251 */           sparseArray.put(8, wm1Var9);
/* 256 */           sparseArray.put(9, wm1Var10);
/* 261 */           sparseArray.put(10, wm1Var11);
/* 266 */           sparseArray.put(11, wm1Var12);
/* 271 */           sparseArray.put(12, wm1Var13);
/* 276 */           sparseArray.put(13, wm1Var14);
/* 283 */           sparseArray.put(14, wm1Var15);
/* 290 */           sparseArray.put(15, wm1Var16);
/* 297 */           sparseArray.put(16, wm1Var17);
/* 304 */           sparseArray.put(17, wm1Var18);
/* 310 */           sparseArray.put(-1, wm1Var19);
                }

                public static wm1 valueOf(String str) {
/* 7 */             return (wm1) Enum.valueOf(wm1.class, str);
                }

                public static wm1[] values() {
/* 7 */             return (wm1[]) f18688b.clone();
                }
            }
