            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.SecondLayer;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ip0 extends sq3 {
                public static final hp0 Companion = new hp0();

                /* JADX INFO: renamed from: U */
                public static final ej0 f11873U = ej0.f7731a;

                /* JADX INFO: renamed from: b */
                public final UsercentricsSettings f11874b;

                /* JADX INFO: renamed from: c */
                public final LegalBasisLocalization f11875c;

                /* JADX INFO: renamed from: d */
                public final ur3 f11876d;

                /* JADX INFO: renamed from: e */
                public final String f11877e;

                /* JADX INFO: renamed from: f */
                public final List f11878f;

                /* JADX INFO: renamed from: i */
                public final List f11879i;

                /* JADX INFO: renamed from: v */
                public final boolean f11880v;

                /* JADX INFO: renamed from: w */
                public final boolean f11881w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ip0(UsercentricsSettings usercentricsSettings, LegalBasisLocalization legalBasisLocalization, ur3 ur3Var, String str, List list, List list2, nv1 nv1Var) {
/* 16 */            super(usercentricsSettings);
/* 1 */             usercentricsSettings.getClass();
/* 4 */             legalBasisLocalization.getClass();
/* 7 */             str.getClass();
/* 10 */            list.getClass();
/* 13 */            list2.getClass();
/* 19 */            this.f11874b = usercentricsSettings;
/* 21 */            this.f11875c = legalBasisLocalization;
/* 23 */            this.f11876d = ur3Var;
/* 25 */            this.f11877e = str;
/* 27 */            this.f11878f = list;
/* 29 */            this.f11879i = list2;
/* 31 */            SecondLayer secondLayer = usercentricsSettings.f6702b;
/* 35 */            this.f11880v = secondLayer.f6440c;
/* 39 */            this.f11881w = secondLayer.f6441d;
                }

                /* JADX INFO: renamed from: A */
                public final du1 m5532A() {
                    boolean z;
/* 3 */             n03.Companion.getClass();
/* 10 */            ArrayList arrayListM6585a = m03.m6585a(this.f11878f, this.f11879i);
/* 22 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayListM6585a, 10));
/* 25 */            Iterator it = arrayListM6585a.iterator();
                    while (true) {
/* 29 */                boolean zHasNext = it.hasNext();
/* 33 */                z = this.f11881w;
/* 35 */                ov1 ov1Var = null;
/* 36 */                if (!zHasNext) {
                            break;
                        }
/* 42 */                C2471xr c2471xr = (C2471xr) it.next();
/* 44 */                if (!z) {
/* 47 */                    ArrayList<m61> arrayList2 = c2471xr.f19330c;
/* 55 */                    ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList2, 10));
/* 66 */                    for (m61 m61Var : arrayList2) {
/* 94 */                        arrayList3.add(new mv1(m61Var, null, this.f11880v, this.f11874b.f6694B, m8626l(m61Var.f13590p), 2));
                            }
/* 100 */                   ov1Var = new ov1(arrayList3);
                        }
/* 113 */               arrayList.add(new cu1(c2471xr, ov1Var, c2471xr.f19328a.f6535c));
                    }
/* 136 */           return new du1(null, arrayList, z ? new fu1(this.f11875c.f6757a.f6792f, this.f11877e) : null);
                }
            }
