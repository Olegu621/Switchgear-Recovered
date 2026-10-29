            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tk2 {
                public static final sk2 Companion = new sk2();

                /* JADX INFO: renamed from: a */
                public final boolean f17136a;

                /* JADX INFO: renamed from: b */
                public final LinkedHashMap f17137b;

                /* JADX INFO: renamed from: c */
                public final LinkedHashMap f17138c;

                public tk2(boolean z, List list, List list2) {
/* 1 */             list.getClass();
/* 4 */             list2.getClass();
/* 13 */            int iM6962c = nc1.m6962c(C2122qw.m8020h(list, 10));
/* 24 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c < 16 ? 16 : iM6962c);
/* 27 */            Iterator it = list.iterator();
                    while (true) {
/* 35 */                Boolean bool = null;
/* 36 */                if (!it.hasNext()) {
                            break;
                        }
/* 42 */                TCFPurpose tCFPurpose = (TCFPurpose) it.next();
/* 46 */                Integer numValueOf = Integer.valueOf(tCFPurpose.f6176c);
/* 52 */                sk2 sk2Var = Companion;
/* 54 */                Boolean bool2 = tCFPurpose.f6178e;
/* 56 */                boolean z2 = tCFPurpose.f6181h;
/* 58 */                sk2Var.getClass();
/* 61 */                bool2 = z2 ? bool2 : null;
/* 65 */                Boolean bool3 = tCFPurpose.f6180g;
/* 69 */                if (tCFPurpose.f6182i) {
/* 71 */                    bool = bool3;
                        }
/* 75 */                linkedHashMap.put(numValueOf, new uk2(bool2, bool));
                    }
/* 83 */            int iM6962c2 = nc1.m6962c(C2122qw.m8020h(list2, 10));
/* 93 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM6962c2 >= 16 ? iM6962c2 : 16);
/* 96 */            Iterator it2 = list2.iterator();
/* 104 */           while (it2.hasNext()) {
/* 110 */               TCFVendor tCFVendor = (TCFVendor) it2.next();
/* 114 */               Integer numValueOf2 = Integer.valueOf(tCFVendor.f6209d);
/* 120 */               sk2 sk2Var2 = Companion;
/* 122 */               Boolean bool4 = tCFVendor.f6206a;
/* 124 */               boolean z3 = tCFVendor.f6218m;
/* 126 */               sk2Var2.getClass();
/* 129 */               bool4 = z3 ? bool4 : null;
/* 133 */               Boolean bool5 = tCFVendor.f6210e;
/* 137 */               if (!tCFVendor.f6219n) {
/* 140 */                   bool5 = null;
                        }
/* 144 */               linkedHashMap2.put(numValueOf2, new uk2(bool4, bool5));
                    }
/* 151 */           this.f17136a = z;
/* 153 */           this.f17137b = linkedHashMap;
/* 155 */           this.f17138c = linkedHashMap2;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x006f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:24:0x0071 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:25:0x0073  */
                /* JADX WARN: Code duplicated, block: B:30:0x0080  */
                /* JADX WARN: Code duplicated, block: B:31:0x0085  */
                /* JADX WARN: Code duplicated, block: B:32:0x0087 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:33:0x0089  */
                /* JADX WARN: Code duplicated, block: B:46:0x0096 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                /* JADX INFO: renamed from: a */
                public final boolean m8807a(uk2 uk2Var, int... iArr) {
/* 1 */             Boolean bool = uk2Var.f17578b;
/* 3 */             Boolean bool2 = uk2Var.f17577a;
/* 5 */             int length = iArr.length;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 boolean zBooleanValue = true;
/* 9 */                 if (i >= length) {
/* 8 */                     return true;
                        }
/* 11 */                int i2 = iArr[i];
/* 23 */                uk2 uk2Var2 = (uk2) this.f17137b.get(Integer.valueOf(i2));
/* 25 */                if (uk2Var2 == null) {
/* 27 */                    zBooleanValue = false;
                        } else {
/* 30 */                    Boolean bool3 = uk2Var2.f17577a;
/* 32 */                    Boolean bool4 = uk2Var2.f17578b;
/* 74 */                    if (!C2103qd.m7780o(new Integer[]{1, 3, 4, 5, 6}).contains(Integer.valueOf(i2))) {
/* 76 */                        Boolean bool5 = Boolean.FALSE;
/* 82 */                        if (Intrinsics.m6216a(bool3, bool5) && Intrinsics.m6216a(bool2, bool5) && bool4 != null) {
/* 92 */                            if (bool == null) {
/* 107 */                               return bool4.booleanValue();
                                    }
/* 98 */                            if (!bool.booleanValue() || !bool4.booleanValue()) {
/* 27 */                                zBooleanValue = false;
                                    }
                                } else if (bool3 != null) {
/* 114 */                           if (bool2 != null) {
/* 129 */                               zBooleanValue = bool3.booleanValue();
                                    } else if (bool2.booleanValue() || !bool3.booleanValue()) {
/* 27 */                                zBooleanValue = false;
                                    }
                                } else if (bool4 == null) {
/* 27 */                            zBooleanValue = false;
                                } else {
/* 136 */                           if (bool != null) {
/* 151 */                               return bool4.booleanValue();
                                    }
/* 142 */                           if (bool.booleanValue() || !bool4.booleanValue()) {
/* 27 */                                zBooleanValue = false;
                                    }
                                }
                            } else if (bool3 != null) {
/* 114 */                       if (bool2 != null) {
/* 129 */                           zBooleanValue = bool3.booleanValue();
                                } else if (bool2.booleanValue()) {
/* 27 */                            zBooleanValue = false;
                                } else {
/* 27 */                            zBooleanValue = false;
                                }
                            } else if (bool4 == null) {
/* 27 */                        zBooleanValue = false;
                            } else {
/* 136 */                       if (bool != null) {
/* 151 */                           return bool4.booleanValue();
                                }
/* 142 */                       if (bool.booleanValue()) {
/* 27 */                            zBooleanValue = false;
                                } else {
/* 27 */                            zBooleanValue = false;
                                }
                            }
                        }
/* 156 */               if (!zBooleanValue) {
/* 6 */                     return false;
                        }
/* 159 */               i++;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof tk2)) {
/* 39 */                return false;
                    }
/* 9 */             tk2 tk2Var = (tk2) obj;
                    return this.f17136a == tk2Var.f17136a && Intrinsics.m6216a(this.f17137b, tk2Var.f17137b) && Intrinsics.m6216a(this.f17138c, tk2Var.f17138c);
                }

                public final int hashCode() {
/* 24 */            return this.f17138c.hashCode() + ((this.f17137b.hashCode() + (Boolean.hashCode(this.f17136a) * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "TCFConsentPayload(eea=" + this.f17136a + ", purposes=" + this.f17137b + ", vendors=" + this.f17138c + ")";
                }
            }
