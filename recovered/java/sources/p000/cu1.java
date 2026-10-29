            package p000;

            import com.usercentrics.sdk.models.settings.ServicesIdStrategy$Companion;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCategory;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 102 */   public final class cu1 {

                /* JADX INFO: renamed from: a */
                public final String f6908a;

                /* JADX INFO: renamed from: b */
                public final String f6909b;

                /* JADX INFO: renamed from: c */
                public final String f6910c;

                /* JADX INFO: renamed from: d */
                public final vv1 f6911d;

                /* JADX INFO: renamed from: e */
                public final pg3 f6912e;

                /* JADX INFO: renamed from: f */
                public final List f6913f;

                /* JADX INFO: renamed from: g */
                public final List f6914g;

                public cu1(C2471xr c2471xr, ov1 ov1Var, String str) {
/* 1 */             c2471xr.getClass();
/* 6 */             boolean z = c2471xr.f19328a.f6536d;
/* 8 */             ArrayList<m61> arrayList = c2471xr.f19330c;
/* 14 */            boolean z2 = false;
/* 15 */            if (!arrayList.isEmpty()) {
/* 18 */                Iterator it = arrayList.iterator();
/* 26 */                while (it.hasNext()) {
/* 38 */                    if (((m61) it.next()).f13590p.f9466b) {
/* 40 */                        z2 = true;
                                break;
                            }
                        }
                    }
/* 43 */            vv1 vv1Var = new vv1(z, z2);
/* 54 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 65 */            for (m61 m61Var : arrayList) {
/* 75 */                m61Var.getClass();
/* 92 */                arrayList2.add(new pu1(ya2.Companion.m2779id(m61Var), new vv1(m61Var)));
                    }
/* 100 */           this(c2471xr, vv1Var, ov1Var, str, arrayList2);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof cu1)) {
/* 7 */                 return false;
                    }
/* 11 */            cu1 cu1Var = (cu1) obj;
                    return Intrinsics.m6216a(this.f6908a, cu1Var.f6908a) && Intrinsics.m6216a(this.f6909b, cu1Var.f6909b) && Intrinsics.m6216a(this.f6910c, cu1Var.f6910c) && Intrinsics.m6216a(this.f6911d, cu1Var.f6911d) && Intrinsics.m6216a(this.f6912e, cu1Var.f6912e) && Intrinsics.m6216a(this.f6913f, cu1Var.f6913f) && Intrinsics.m6216a(this.f6914g, cu1Var.f6914g);
                }

                public final int hashCode() {
/* 12 */            int iM7485h = pm2.m7485h(this.f6908a.hashCode() * 31, 31, this.f6909b);
/* 17 */            String str = this.f6910c;
/* 28 */            int iHashCode = (iM7485h + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            vv1 vv1Var = this.f6911d;
/* 40 */            int iHashCode2 = (iHashCode + (vv1Var == null ? 0 : vv1Var.hashCode())) * 31;
/* 41 */            pg3 pg3Var = this.f6912e;
/* 52 */            int iHashCode3 = (iHashCode2 + (pg3Var == null ? 0 : pg3Var.hashCode())) * 31;
/* 53 */            List list = this.f6913f;
/* 64 */            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
/* 65 */            List list2 = this.f6914g;
/* 74 */            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("PredefinedUICardUI(id=", this.f6908a, ", title=", this.f6909b, ", shortDescription=");
/* 17 */            sbM3514r.append(this.f6910c);
/* 22 */            sbM3514r.append(", mainSwitchSettings=");
/* 27 */            sbM3514r.append(this.f6911d);
/* 32 */            sbM3514r.append(", content=");
/* 37 */            sbM3514r.append(this.f6912e);
/* 42 */            sbM3514r.append(", switchSettings=");
/* 47 */            sbM3514r.append(this.f6913f);
/* 52 */            sbM3514r.append(", dependantSwitchSettings=");
/* 57 */            sbM3514r.append(this.f6914g);
/* 62 */            sbM3514r.append(")");
/* 65 */            return sbM3514r.toString();
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 103 */       public cu1(cl2 cl2Var, pg3 pg3Var, ArrayList arrayList) {
/* 108 */           this(cl2Var.f2983a, cl2Var.f2985c, (String) null, cl2Var.f2989g, pg3Var, arrayList, cl2Var.f2994l);
                    cl2Var.getClass();
                }

/* 108 */       public /* synthetic */ cu1(String str, String str2, String str3, vv1 vv1Var, pg3 pg3Var, List list, int i) {
/* 109 */           this(str, str2, str3, vv1Var, pg3Var, (List) null, (i & 64) != 0 ? null : list);
                }

/* 109 */       public cu1(String str, String str2, String str3, vv1 vv1Var, pg3 pg3Var, List list, List list2) {
                    str.getClass();
                    str2.getClass();
/* 111 */           this.f6908a = str;
/* 112 */           this.f6909b = str2;
/* 113 */           this.f6910c = str3;
/* 114 */           this.f6911d = vv1Var;
/* 115 */           this.f6912e = pg3Var;
/* 116 */           this.f6913f = list;
/* 117 */           this.f6914g = list2;
                }

/* 117 */       public /* synthetic */ cu1(C2471xr c2471xr, ov1 ov1Var, String str, int i) {
/* 118 */           this(c2471xr, null, ov1Var, str, null);
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 118 */       public cu1(C2471xr c2471xr, vv1 vv1Var, pg3 pg3Var, String str, ArrayList arrayList) {
                    c2471xr.getClass();
/* 119 */           ServicesIdStrategy$Companion servicesIdStrategy$Companion = ya2.Companion;
/* 120 */           UsercentricsCategory usercentricsCategory = c2471xr.f19328a;
/* 123 */           this(servicesIdStrategy$Companion.m2778id(usercentricsCategory), usercentricsCategory.f6534b, str, vv1Var, pg3Var, arrayList, 32);
                }

/* 123 */       public cu1(m61 m61Var, vv1 vv1Var, sv1 sv1Var) {
/* 127 */           this(ya2.Companion.m2779id(m61Var), m61Var.f13582h, m61Var.f13589o, vv1Var, sv1Var, (List) null, 96);
                }
            }
