            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d23 {
                /* JADX INFO: renamed from: a */
                public static u13 m2911a(String str) throws Throwable {
                    x13 x13Var;
                    int i;
                    u13 u13VarM4550a;
/* 1 */             uy0 uy0Var = vy0.Companion;
/* 3 */             C2109qj c2109qj = EnumC2146rj.Companion;
/* 8 */             String strSubstring = str.substring(0, 16);
/* 12 */            uy0Var.getClass();
/* 19 */            int iM9146a = (int) uy0.m9146a(16, strSubstring);
/* 20 */            w13 w13Var = x13.Companion;
/* 35 */            int iM9146a2 = (int) uy0.m9146a(1, String.valueOf(str.charAt(16)));
/* 36 */            w13Var.getClass();
/* 39 */            if (iM9146a2 == 0) {
/* 60 */                x13Var = x13.f18910a;
                    } else {
/* 41 */                if (iM9146a2 != 1) {
/* 59 */                    throw new Throwable(AbstractC0886en.m3505i(iM9146a2, "Invalid Value for VectorEncodingType: ", ", valid values are 0 and 1"));
                        }
/* 43 */                x13Var = x13.f18911b;
                    }
/* 66 */            if (x13Var == x13.f18911b) {
/* 70 */                u13VarM4550a = new u13();
/* 73 */                i = 29;
/* 85 */                int iM9146a3 = (int) uy0.m9146a(12, str.substring(17, 29));
/* 86 */                for (int i2 = 0; i2 < iM9146a3; i2++) {
/* 88 */                    C0847dk c0847dk = AbstractC0883ek.Companion;
/* 94 */                    String strValueOf = String.valueOf(str.charAt(i));
/* 98 */                    c0847dk.getClass();
/* 101 */                   strValueOf.getClass();
/* 106 */                   boolean zEquals = strValueOf.equals("1");
/* 110 */                   C2109qj c2109qj2 = EnumC2146rj.Companion;
/* 114 */                   uy0 uy0Var2 = vy0.Companion;
/* 116 */                   int i3 = i + 17;
/* 118 */                   String strSubstring2 = str.substring(i + 1, i3);
/* 122 */                   uy0Var2.getClass();
/* 129 */                   int iM9146a4 = (int) uy0.m9146a(16, strSubstring2);
/* 130 */                   if (zEquals) {
/* 132 */                       i += 33;
/* 142 */                       int iM9146a5 = (int) uy0.m9146a(16, str.substring(i3, i));
/* 143 */                       if (iM9146a4 <= iM9146a5) {
                                    while (true) {
/* 145 */                               u13VarM4550a.m8935b(iM9146a4);
/* 148 */                               if (iM9146a4 != iM9146a5) {
/* 150 */                                   iM9146a4++;
                                        }
                                    }
                                }
                            } else {
/* 153 */                       u13VarM4550a.m8935b(iM9146a4);
/* 156 */                       i = i3;
                            }
                        }
                    } else {
/* 160 */               i = 17 + iM9146a;
/* 162 */               String strSubstring3 = str.substring(17, i);
/* 166 */               ij0 ij0Var = jj0.Companion;
/* 168 */               Integer numValueOf = Integer.valueOf(iM9146a);
/* 172 */               ij0Var.getClass();
/* 175 */               u13VarM4550a = ij0.m4550a(numValueOf, strSubstring3);
                    }
/* 179 */           u13VarM4550a.f17330a = i;
/* 181 */           return u13VarM4550a;
                }

                /* JADX INFO: renamed from: b */
                public static String m2912b(u13 u13Var) throws C0900f0 {
/* 1 */             u13Var.getClass();
/* 6 */             ArrayList<List> arrayList = new ArrayList();
/* 11 */            h22 h22Var = new h22();
/* 19 */            h22Var.f8873a = new ArrayList();
/* 21 */            uy0 uy0Var = vy0.Companion;
/* 27 */            uh2 uh2Var = new uh2(u13Var.f17331b);
/* 30 */            C2109qj c2109qj = EnumC2146rj.Companion;
/* 32 */            uy0Var.getClass();
/* 37 */            String strM9147b = uy0.m9147b(uh2Var, 16);
/* 43 */            h22 h22Var2 = new h22();
/* 48 */            h22Var2.f8873a = HttpUrl.FRAGMENT_ENCODE_SET;
/* 52 */            e22 e22Var = new e22();
/* 59 */            int i = 17 + u13Var.f17331b;
/* 63 */            f22 f22Var = new f22();
/* 68 */            f22Var.f7976a = 29;
/* 73 */            c23 c23Var = new c23(h22Var2, e22Var, u13Var, f22Var, i, h22Var, arrayList);
/* 80 */            for (int i2 = 1; i2 <= u13Var.f17331b; i2++) {
/* 94 */                c23Var.invoke(Boolean.valueOf(u13Var.m8934a(i2)), Integer.valueOf(i2));
                    }
/* 102 */           if (!e22Var.f7490a) {
/* 262 */               w13 w13Var = x13.Companion;
/* 283 */               return strM9147b.concat("0") + h22Var2.f8873a;
                    }
/* 104 */           w13 w13Var2 = x13.Companion;
/* 108 */           String strConcat = strM9147b.concat("1");
/* 123 */           String strM9147b2 = uy0.m9147b(new uh2(arrayList.size()), 12);
/* 135 */           for (List list : arrayList) {
/* 152 */               boolean z = list.size() == 1;
/* 157 */               AbstractC0883ek.Companion.getClass();
/* 175 */               String str = ((Object) strM9147b2) + C0847dk.m3142a(!z);
/* 179 */               uy0 uy0Var2 = vy0.Companion;
/* 193 */               uh2 uh2Var2 = new uh2(((Number) list.get(0)).intValue());
/* 196 */               C2109qj c2109qj2 = EnumC2146rj.Companion;
/* 198 */               uy0Var2.getClass();
/* 216 */               strM9147b2 = ((Object) str) + uy0.m9147b(uh2Var2, 16);
/* 220 */               if (!z) {
/* 252 */                   strM9147b2 = ((Object) strM9147b2) + uy0.m9147b(new uh2(((Number) list.get(1)).intValue()), 16);
                        }
                    }
/* 257 */           return strConcat.concat(strM9147b2);
                }
            }
