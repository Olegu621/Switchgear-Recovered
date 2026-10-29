            package p000;

            import android.os.Bundle;
            import com.google.android.gms.common.data.DataHolder;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import org.json.JSONArray;
            import org.json.JSONException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fr3 extends je3 {
                @Override // p000.sc3
                public final /* synthetic */ void zza(Bundle bundle, Object obj) {
/* 12 */            bundle.putStringArrayList(getName(), new ArrayList<>((Collection) obj));
                }

                @Override // p000.sc3
                public final /* synthetic */ Object zzb(Bundle bundle) {
/* 5 */             return bundle.getStringArrayList(getName());
                }

                @Override // p000.sc3
                public final Object zzc(DataHolder dataHolder, int i, int i2) {
                    try {
/* 5 */                 String strM2015G1 = dataHolder.m2015G1(i, i2, getName());
/* 9 */                 if (strM2015G1 == null) {
/* 11 */                    return null;
                        }
/* 15 */                ArrayList arrayList = new ArrayList();
/* 20 */                JSONArray jSONArray = new JSONArray(strM2015G1);
/* 28 */                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
/* 34 */                    arrayList.add(jSONArray.getString(i3));
                        }
/* 40 */                return Collections.unmodifiableCollection(arrayList);
                    } catch (JSONException e) {
/* 53 */                throw new IllegalStateException("DataHolder supplied invalid JSON", e);
                    }
                }
            }
