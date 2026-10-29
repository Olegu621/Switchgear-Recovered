            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bl2 {
                public static final al2 Companion = new al2();

                /* JADX INFO: renamed from: i */
                public static final ej0 f2522i = ej0.f7731a;

                /* JADX INFO: renamed from: a */
                public final UsercentricsSettings f2523a;

                /* JADX INFO: renamed from: b */
                public final TCFData f2524b;

                /* JADX INFO: renamed from: c */
                public final ur3 f2525c;

                /* JADX INFO: renamed from: d */
                public final List f2526d;

                /* JADX INFO: renamed from: e */
                public final List f2527e;

                /* JADX INFO: renamed from: f */
                public final boolean f2528f;

                /* JADX INFO: renamed from: g */
                public final boolean f2529g;

                /* JADX INFO: renamed from: h */
                public final hk2 f2530h;

                public bl2(UsercentricsSettings usercentricsSettings, TCFData tCFData, ur3 ur3Var, List list, List list2) {
/* 1 */             usercentricsSettings.getClass();
/* 4 */             list.getClass();
/* 7 */             list2.getClass();
/* 13 */            this.f2523a = usercentricsSettings;
/* 15 */            this.f2524b = tCFData;
/* 17 */            this.f2525c = ur3Var;
/* 19 */            this.f2526d = list;
/* 21 */            this.f2527e = list2;
/* 23 */            TCF2Settings tCF2Settings = usercentricsSettings.f6720t;
/* 25 */            tCF2Settings.getClass();
/* 32 */            this.f2528f = !tCF2Settings.f6531y;
/* 34 */            tCF2Settings.getClass();
/* 39 */            this.f2529g = tCF2Settings.f6470A;
/* 52 */            this.f2530h = r51.m8065b(new C0908f8(this, 10));
                }

                /* JADX INFO: renamed from: a */
                public final boolean m1390a() {
/* 1 */             UsercentricsSettings usercentricsSettings = this.f2523a;
/* 3 */             TCF2Settings tCF2Settings = usercentricsSettings.f6720t;
/* 10 */            Boolean bool = tCF2Settings != null ? tCF2Settings.f6482M : null;
/* 14 */            if (!this.f2528f) {
/* 23 */                if (Intrinsics.m6216a(bool, Boolean.FALSE)) {
/* 42 */                    return true;
                        }
/* 26 */                TCF2Settings tCF2Settings2 = usercentricsSettings.f6720t;
/* 40 */                if (tCF2Settings2 != null ? Intrinsics.m6216a(tCF2Settings2.f6481L, Boolean.TRUE) : false) {
/* 42 */                    return true;
                        }
                    }
/* 13 */            return false;
                }

                /* JADX INFO: renamed from: b */
                public final du1 m1391b(String str, ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             ArrayList<cl2> arrayListM6183B = CollectionsKt.m6183B(arrayList, arrayList2);
/* 7 */             ArrayList arrayList3 = new ArrayList();
/* 19 */            for (cl2 cl2Var : arrayListM6183B) {
/* 29 */                if (!cl2Var.f2986d) {
/* 34 */                    TCF2Settings tCF2Settings = this.f2523a.f6720t;
/* 36 */                    tCF2Settings.getClass();
/* 59 */                    arrayList3.add(new cu1(cl2Var, tCF2Settings.f6491V ? new qv1(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, cl2Var.f2990h) : null, (ArrayList) null));
                        }
                    }
/* 65 */            return new du1(str, arrayList3, null);
                }

                /* JADX INFO: renamed from: c */
                public final cl2 m1392c(eg2 eg2Var, List list, ArrayList arrayList) {
/* 5 */             ArrayList<cl2> arrayList2 = new ArrayList();
/* 16 */            for (Object obj : arrayList) {
/* 23 */                cl2 cl2Var = (cl2) obj;
/* 27 */                if (cl2Var.f2986d && list.contains(Integer.valueOf(cl2Var.f2984b))) {
/* 41 */                    arrayList2.add(obj);
                        }
                    }
/* 53 */            ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList2, 10));
/* 64 */            for (cl2 cl2Var2 : arrayList2) {
/* 87 */                arrayList3.add(new pu1(cl2Var2.f2983a, new vv1(false, cl2Var2.f2987e)));
                    }
/* 93 */            return new cl2(eg2Var, this.f2528f, arrayList3);
                }
            }
