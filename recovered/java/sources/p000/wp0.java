            package p000;

            import com.usercentrics.tcf.core.model.gvl.Declarations;
            import com.usercentrics.tcf.core.model.gvl.Vendor;
            import com.usercentrics.tcf.core.model.gvl.VendorList;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wp0 {
                public static final tp0 Companion = new tp0();

                /* JADX INFO: renamed from: a */
                public final fs0 f18718a;

                /* JADX INFO: renamed from: c */
                public List f18720c;

                /* JADX INFO: renamed from: k */
                public boolean f18728k;

                /* JADX INFO: renamed from: l */
                public Map f18729l;

                /* JADX INFO: renamed from: m */
                public String f18730m;

                /* JADX INFO: renamed from: b */
                public Map f18719b = null;

                /* JADX INFO: renamed from: d */
                public Integer f18721d = null;

                /* JADX INFO: renamed from: e */
                public Map f18722e = null;

                /* JADX INFO: renamed from: f */
                public Map f18723f = null;

                /* JADX INFO: renamed from: g */
                public Map f18724g = null;

                /* JADX INFO: renamed from: h */
                public Map f18725h = null;

                /* JADX INFO: renamed from: i */
                public Map f18726i = null;

                /* JADX INFO: renamed from: j */
                public Map f18727j = null;

                public wp0(fs0 fs0Var) {
/* 4 */             this.f18718a = fs0Var;
/* 23 */            od0 od0Var = od0.f14715a;
/* 25 */            od0Var.getClass();
/* 28 */            this.f18729l = od0Var;
/* 32 */            this.f18730m = "EN";
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m9596a(String str, d10 d10Var) throws Throwable {
                    up0 up0Var;
                    Object objM3819p;
/* 3 */             if (d10Var instanceof up0) {
/* 6 */                 up0Var = (up0) d10Var;
/* 8 */                 int i = up0Var.f17620e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    up0Var.f17620e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    up0Var = new up0(this, d10Var);
                        }
                    } else {
/* 22 */                up0Var = new up0(this, d10Var);
                    }
/* 25 */            Object obj = up0Var.f17618c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = up0Var.f17620e;
/* 31 */            Object obj2 = null;
                    try {
/* 33 */                if (i2 == 0) {
/* 57 */                    pg3.m7417A(obj);
/* 62 */                    String upperCase = str.toUpperCase(Locale.ROOT);
/* 66 */                    upperCase.getClass();
/* 75 */                    if (upperCase.equals(this.f18730m)) {
/* 77 */                        m42 m42Var = o42.f14612b;
/* 79 */                        return Unit.f12910a;
                            }
/* 82 */                    fs0 fs0Var = this.f18718a;
/* 84 */                    up0Var.f17616a = this;
/* 86 */                    up0Var.f17617b = str;
/* 88 */                    up0Var.f17620e = 1;
/* 90 */                    objM3819p = fs0Var.m3819p(str, up0Var);
/* 94 */                    if (objM3819p == z10Var) {
/* 96 */                        return z10Var;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 53 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    str = up0Var.f17617b;
/* 39 */                    this = up0Var.f17616a;
/* 41 */                    pg3.m7417A(obj);
/* 46 */                    objM3819p = ((o42) obj).f14613a;
                        }
/* 97 */                Throwable thM7099a = o42.m7099a(objM3819p);
/* 101 */               if (thM7099a != null) {
/* 143 */                   throw thM7099a;
                        }
/* 103 */               this.f18730m = str;
/* 107 */               if (!(objM3819p instanceof n42)) {
/* 110 */                   obj2 = objM3819p;
                        }
/* 111 */               obj2.getClass();
/* 114 */               Declarations declarations = (Declarations) obj2;
/* 118 */               this.f18723f = declarations.f6802a;
/* 122 */               this.f18726i = declarations.f6803b;
/* 126 */               this.f18722e = declarations.f6804c;
/* 130 */               this.f18725h = declarations.f6805d;
/* 134 */               this.f18727j = declarations.f6806e;
/* 138 */               this.f18724g = declarations.f6807f;
/* 140 */               return Unit.f12910a;
                    } catch (Exception e) {
/* 144 */               m42 m42Var2 = o42.f14612b;
/* 165 */               return new n42(new xp0(AbstractC0886en.m3509m("Unable to fetch language (", str, ") declarations: ", e.getMessage()), e));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: b */
                public final Object m9597b(d10 d10Var) {
                    vp0 vp0Var;
                    Object objM3822s;
/* 3 */             if (d10Var instanceof vp0) {
/* 6 */                 vp0Var = (vp0) d10Var;
/* 8 */                 int i = vp0Var.f18281d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    vp0Var.f18281d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    vp0Var = new vp0(this, d10Var);
                        }
                    } else {
/* 22 */                vp0Var = new vp0(this, d10Var);
                    }
/* 25 */            Object obj = vp0Var.f18279b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = vp0Var.f18281d;
/* 33 */            if (i2 == 0) {
/* 53 */                pg3.m7417A(obj);
/* 56 */                vp0Var.f18278a = this;
/* 58 */                vp0Var.f18281d = 1;
/* 62 */                objM3822s = this.f18718a.m3822s(vp0Var);
/* 66 */                if (objM3822s == z10Var) {
/* 68 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 49 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                this = vp0Var.f18278a;
/* 39 */                pg3.m7417A(obj);
/* 44 */                objM3822s = ((o42) obj).f14613a;
                    }
/* 69 */            m42 m42Var = o42.f14612b;
/* 78 */            VendorList vendorList = (VendorList) (objM3822s instanceof n42 ? null : objM3822s);
/* 80 */            if (vendorList == null) {
/* 82 */                Throwable thM7099a = o42.m7099a(objM3822s);
/* 86 */                if (thM7099a == null) {
/* 92 */                    thM7099a = new vz2("Error when initializing TCF #111");
                        }
/* 97 */                return new n42(thM7099a);
                    }
/* 101 */           this.getClass();
/* 106 */           this.f18723f = vendorList.f6857f;
/* 110 */           this.f18726i = vendorList.f6860i;
/* 114 */           this.f18722e = vendorList.f6858g;
/* 118 */           this.f18725h = vendorList.f6859h;
/* 122 */           this.f18727j = vendorList.f6861j;
/* 126 */           this.f18724g = vendorList.f6862k;
/* 130 */           this.f18721d = vendorList.f6854c;
/* 132 */           Map map = vendorList.f6856e;
/* 134 */           this.f18719b = map;
/* 136 */           map.getClass();
/* 139 */           this.f18729l = map;
/* 141 */           this.m9598c(null);
/* 144 */           this.f18728k = true;
/* 146 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: c */
                public final void m9598c(List list) {
/* 1 */             if (list == null) {
/* 5 */                 Set setKeySet = this.f18729l.keySet();
/* 17 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(setKeySet, 10));
/* 20 */                Iterator it = setKeySet.iterator();
/* 28 */                while (it.hasNext()) {
/* 44 */                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
/* 48 */                list = arrayList;
                    }
/* 51 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 54 */            Map map = this.f18719b;
/* 56 */            Iterator it2 = list.iterator();
/* 64 */            while (it2.hasNext()) {
/* 72 */                int iIntValue = ((Number) it2.next()).intValue();
/* 89 */                Vendor vendor = map != null ? (Vendor) map.get(String.valueOf(iIntValue)) : null;
/* 90 */                if (vendor != null && vendor.f6839h == null) {
/* 100 */                   linkedHashMap.put(String.valueOf(iIntValue), vendor);
                        }
                    }
/* 104 */           this.f18719b = linkedHashMap;
/* 110 */           this.f18720c = CollectionsKt.m6185D(list);
                }
            }
