            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import com.usercentrics.tcf.core.model.gvl.DataRetention;
            import com.usercentrics.tcf.core.model.gvl.RetentionPeriod;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ol2 {

                /* JADX INFO: renamed from: a */
                public final UsercentricsSettings f14801a;

                /* JADX INFO: renamed from: b */
                public final ac1 f14802b;

                /* JADX INFO: renamed from: c */
                public final cl2 f14803c;

                /* JADX INFO: renamed from: d */
                public final TCFVendor f14804d;

                /* JADX INFO: renamed from: e */
                public final lv1 f14805e;

                /* JADX INFO: renamed from: f */
                public final lv1 f14806f;

                /* JADX INFO: renamed from: g */
                public final lv1 f14807g;

                /* JADX INFO: renamed from: h */
                public final lv1 f14808h;

                /* JADX INFO: renamed from: i */
                public final lv1 f14809i;

                /* JADX INFO: renamed from: j */
                public final lv1 f14810j;

                /* JADX INFO: renamed from: k */
                public final lv1 f14811k;

                public ol2(b23 b23Var, UsercentricsSettings usercentricsSettings, ac1 ac1Var) {
                    lv1 lv1Var;
/* 1 */             b23Var.getClass();
/* 4 */             usercentricsSettings.getClass();
/* 7 */             ac1Var.getClass();
/* 13 */            this.f14801a = usercentricsSettings;
/* 15 */            this.f14802b = ac1Var;
/* 19 */            TCF2Settings tCF2Settings = usercentricsSettings.f6720t;
/* 21 */            tCF2Settings.getClass();
/* 29 */            this.f14803c = new cl2(b23Var, tCF2Settings.f6470A);
/* 31 */            TCFVendor tCFVendor = b23Var.f2184c;
/* 33 */            this.f14804d = tCFVendor;
/* 39 */            String str = m7207b().f6518l;
/* 41 */            List list = tCFVendor.f6214i;
/* 43 */            DataRetention dataRetention = tCFVendor.f6226u;
/* 56 */            this.f14805e = m7206a(str, list, dataRetention != null ? dataRetention.f6799b : null);
/* 70 */            this.f14806f = m7206a(m7207b().f6471B, tCFVendor.f6227v, null);
/* 76 */            String str2 = m7207b().f6472C;
/* 83 */            Integer num = dataRetention != null ? dataRetention.f6798a : null;
/* 84 */            if (num == null) {
/* 86 */                lv1Var = null;
                    } else {
/* 109 */               lv1Var = new lv1(str2, new rv1("• " + num));
                    }
/* 112 */           this.f14807g = lv1Var;
/* 126 */           this.f14808h = m7206a(m7207b().f6516k, tCFVendor.f6211f, null);
/* 146 */           this.f14809i = m7206a(m7207b().f6520n, tCFVendor.f6217l, dataRetention != null ? dataRetention.f6800c : null);
/* 160 */           this.f14810j = m7206a(m7207b().f6514j, tCFVendor.f6207b, null);
/* 174 */           this.f14811k = m7206a(m7207b().f6519m, tCFVendor.f6216k, null);
                }

                /* JADX INFO: renamed from: a */
                public final lv1 m7206a(String str, List list, RetentionPeriod retentionPeriod) {
/* 15 */            String strM6203x = CollectionsKt.m6203x(list, "\n", null, null, new C1996oc(9, retentionPeriod, this), 30);
/* 23 */            if (StringsKt.m6228D(strM6203x)) {
/* 25 */                return null;
                    }
/* 34 */            return new lv1(str, new rv1(strM6203x));
                }

                /* JADX INFO: renamed from: b */
                public final TCF2Settings m7207b() {
/* 3 */             TCF2Settings tCF2Settings = this.f14801a.f6720t;
/* 5 */             tCF2Settings.getClass();
/* 8 */             return tCF2Settings;
                }
            }
