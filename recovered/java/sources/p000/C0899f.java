            package p000;

            import com.supercell.p007id.scid_plugin.PromiseUtilKt;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataWhitelist;
            import com.supercell.titan.agesignals.AgeSignals;
            import com.supercell.titan.usercentrics.UsercentricsSDK;
            import java.util.Date;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0899f implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7943a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f7944b;

                public /* synthetic */ C0899f(Object obj, int i) {
/* 1 */             this.f7943a = i;
/* 3 */             this.f7944b = obj;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str;
/* 1 */             int i = this.f7943a;
/* 3 */             Object obj2 = this.f7944b;
                    switch (i) {
                        case 0:
                            return obj == ((AbstractC0936g) obj2) ? "(this Collection)" : String.valueOf(obj);
                        case 1:
/* 48 */                    AgeSignals ageSignals = (AgeSignals) obj2;
/* 50 */                    ek3 ek3Var = (ek3) obj;
/* 52 */                    int i2 = AgeSignals.MAX_RETRIES;
/* 54 */                    Integer num = ek3Var.f7771a;
/* 65 */                    int iIntValue = num != null ? num.intValue() : -1;
/* 66 */                    Integer num2 = ek3Var.f7772b;
/* 76 */                    int iIntValue2 = num2 != null ? num2.intValue() : -1;
/* 77 */                    Integer num3 = ek3Var.f7773c;
/* 81 */                    int iIntValue3 = num3 != null ? num3.intValue() : -1;
/* 86 */                    Date date = ek3Var.f7774d;
/* 88 */                    if (date == null || (str = AgeSignals.f5982e.format(date)) == null) {
/* 100 */                       str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 112 */                   ageSignals.f5983a = new AgeSignals.AgeRangeResult(false, 0, iIntValue, iIntValue2, iIntValue3, str, 1, null);
/* 114 */                   return Unit.f12910a;
                        case 2:
/* 43 */                    return ((sc1) obj2).m8477a(((Integer) obj).intValue());
                        case 3:
/* 1 */                     return PromiseUtilKt.onCancel$lambda$4((Function1) obj2, (Exception) obj);
                        case 4:
/* 1 */                     return SharedDataWhitelist.loadFromPersistentStorage$lambda$3((JSONObject) obj2, (String) obj);
                        default:
/* 1 */                     return UsercentricsSDK.getConsentOrShowDialog$lambda$1((UsercentricsSDK) obj2, (tz2) obj);
                    }
                }
            }
