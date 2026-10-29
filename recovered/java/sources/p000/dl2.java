            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dl2 extends sq3 {

                /* JADX INFO: renamed from: U */
                public final List f7296U;

                /* JADX INFO: renamed from: V */
                public final boolean f7297V;

                /* JADX INFO: renamed from: W */
                public final boolean f7298W;

                /* JADX INFO: renamed from: b */
                public final UsercentricsSettings f7299b;

                /* JADX INFO: renamed from: c */
                public final TCFData f7300c;

                /* JADX INFO: renamed from: d */
                public final LegalBasisLocalization f7301d;

                /* JADX INFO: renamed from: e */
                public final ur3 f7302e;

                /* JADX INFO: renamed from: f */
                public final List f7303f;

                /* JADX INFO: renamed from: i */
                public final List f7304i;

                /* JADX INFO: renamed from: v */
                public final ac1 f7305v;

                /* JADX INFO: renamed from: w */
                public final String f7306w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dl2(UsercentricsSettings usercentricsSettings, TCFData tCFData, LegalBasisLocalization legalBasisLocalization, ur3 ur3Var, List list, List list2, ac1 ac1Var, String str, List list3) {
/* 19 */            super(usercentricsSettings);
/* 1 */             usercentricsSettings.getClass();
/* 4 */             legalBasisLocalization.getClass();
/* 7 */             list.getClass();
/* 10 */            list2.getClass();
/* 13 */            str.getClass();
/* 16 */            list3.getClass();
/* 22 */            this.f7299b = usercentricsSettings;
/* 24 */            this.f7300c = tCFData;
/* 26 */            this.f7301d = legalBasisLocalization;
/* 28 */            this.f7302e = ur3Var;
/* 30 */            this.f7303f = list;
/* 32 */            this.f7304i = list2;
/* 34 */            this.f7305v = ac1Var;
/* 36 */            this.f7306w = str;
/* 38 */            this.f7296U = list3;
/* 40 */            TCF2Settings tCF2Settings = usercentricsSettings.f6720t;
/* 42 */            tCF2Settings.getClass();
/* 49 */            this.f7297V = !tCF2Settings.f6532z;
/* 53 */            this.f7298W = tCF2Settings.f6470A;
                }

                /* JADX INFO: renamed from: B */
                public static String m3150B(String str, String str2) {
/* 7 */             return fm0.m3785k("\u202b", str, "\u202c \u202a(", str2, ")\u202c");
                }

                /* JADX INFO: renamed from: A */
                public final ArrayList m3151A(cl2 cl2Var) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             boolean z = cl2Var.f2992j;
/* 9 */             UsercentricsSettings usercentricsSettings = this.f7299b;
/* 11 */            if (z) {
/* 15 */                TCF2Settings tCF2Settings = usercentricsSettings.f6720t;
/* 17 */                tCF2Settings.getClass();
/* 29 */                arrayList.add(new vv1("consent", tCF2Settings.f6521o, false, cl2Var.f2987e));
                    }
/* 34 */            if (cl2Var.f2993k) {
/* 38 */                TCF2Settings tCF2Settings2 = usercentricsSettings.f6720t;
/* 40 */                tCF2Settings2.getClass();
/* 52 */                arrayList.add(new vv1("legitimateInterest", tCF2Settings2.f6522p, false, cl2Var.f2988f));
                    }
/* 55 */            return arrayList;
                }
            }
