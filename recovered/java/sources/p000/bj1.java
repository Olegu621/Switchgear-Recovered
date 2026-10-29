            package p000;

            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            import java.util.Map;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1859c;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bj1 extends ui1 {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f2446c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ bj1(we2 we2Var, int i, int i2) {
/* 3 */             super(we2Var, i);
/* 1 */             this.f2446c = i2;
                }

                /* JADX INFO: renamed from: b */
                private final void m1363b() {
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0078  */
                @Override // p000.ui1
                /* JADX INFO: renamed from: a */
                public final void mo294a() {
                    String strMo6271a;
/* 1 */             int i = this.f2446c;
/* 3 */             we2 we2Var = this.f17544a;
                    switch (i) {
                        case 0:
                            break;
                        case 1:
/* 248 */                   ((od2) we2Var.f18595b).m7135a("cache");
                            break;
                        case 2:
/* 238 */                   ((od2) we2Var.f18595b).m7135a("locationTimeStamp");
                            break;
                        case 3:
/* 34 */                    od2 od2Var = (od2) we2Var.f18595b;
/* 36 */                    od2Var.getClass();
/* 44 */                    String string = od2Var.f14716a.getString("settings", null);
/* 48 */                    if (string == null || StringsKt.m6228D(string)) {
/* 121 */                       strMo6271a = null;
                            } else {
/* 57 */                        r11 r11Var = b21.f2178a;
/* 83 */                        AbstractC1858b abstractC1858b = (AbstractC1858b) ((C1859c) r11Var.m1198a(string, jb1.m5766z(r11Var.f2163b, j22.m5668b(C1859c.class)))).get("id");
/* 96 */                        strMo6271a = abstractC1858b != null ? py0.m7602b0(abstractC1858b).mo6271a() : null;
/* 97 */                        if (strMo6271a == null || StringsKt.m6228D(strMo6271a)) {
/* 121 */                           strMo6271a = null;
                                } else {
/* 106 */                           fh2[] fh2VarArr = fh2.f8216a;
/* 114 */                           od2Var.m7138d("settings-".concat(strMo6271a), string);
/* 117 */                           od2Var.m7135a("settings");
                                }
                            }
/* 122 */                   if (strMo6271a != null) {
/* 124 */                       od2Var.getClass();
/* 131 */                       String string2 = od2Var.f14716a.getString("tcf", null);
/* 135 */                       if (string2 != null && !StringsKt.m6228D(string2)) {
/* 144 */                           r11 r11Var2 = b21.f2178a;
/* 162 */                           StorageTCF storageTCF = (StorageTCF) r11Var2.m1198a(string2, jb1.m5766z(r11Var2.f2163b, j22.m5668b(StorageTCF.class)));
/* 166 */                           od2 od2Var2 = (od2) we2Var.f18596c;
/* 168 */                           od2Var2.getClass();
/* 177 */                           String string3 = od2Var2.f14716a.getString("IABTCF_AddtlConsent", HttpUrl.FRAGMENT_ENCODE_SET);
/* 181 */                           String str = storageTCF.f6145a;
/* 183 */                           Map map = storageTCF.f6146b;
/* 185 */                           StorageTCF.Companion companion = StorageTCF.Companion;
/* 187 */                           str.getClass();
/* 190 */                           map.getClass();
/* 208 */                           String strM1199b = r11Var2.m1199b(jb1.m5766z(r11Var2.f2163b, j22.m5668b(StorageTCF.class)), new StorageTCF(str, string3, map));
/* 212 */                           fh2[] fh2VarArr2 = fh2.f8216a;
/* 220 */                           od2Var.m7138d("tcf-".concat(strMo6271a), strM1199b);
/* 225 */                           od2Var.m7138d("actual_tcf", strMo6271a);
/* 228 */                           od2Var.m7135a("tcf");
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    od2 od2Var3 = (od2) we2Var.f18596c;
/* 14 */                    od2Var3.m7135a("IABTCF_EnableAdvertiserConsentMode");
/* 28 */                    od2Var3.f14716a.edit().putInt("IABTCF_EnableAdvertiserConsentMode", 1).apply();
                            break;
                    }
                }
            }
