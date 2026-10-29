            package p000;

            import com.google.android.gms.internal.play_billing.zzco;
            import java.util.ArrayList;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yx1 {

                /* JADX INFO: renamed from: a */
                public final String f19844a;

                /* JADX INFO: renamed from: b */
                public final String f19845b;

                /* JADX INFO: renamed from: c */
                public final String f19846c;

                /* JADX INFO: renamed from: d */
                public final String f19847d;

                /* JADX INFO: renamed from: e */
                public final lf3 f19848e;

                public yx1(JSONObject jSONObject) throws JSONException {
/* 10 */            this.f19844a = jSONObject.optString("formattedPrice");
/* 14 */            jSONObject.optLong("priceAmountMicros");
/* 23 */            this.f19845b = jSONObject.optString("priceCurrencyCode");
/* 27 */            String strOptString = jSONObject.optString("offerIdToken");
/* 35 */            lf3 lf3Var = null;
/* 40 */            this.f19846c = true == strOptString.isEmpty() ? null : strOptString;
/* 48 */            jSONObject.optString("offerId").getClass();
/* 57 */            jSONObject.optString("purchaseOptionId").getClass();
/* 62 */            jSONObject.optInt("offerType");
/* 67 */            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
/* 73 */            ArrayList arrayList = new ArrayList();
/* 77 */            if (jSONArrayOptJSONArray != null) {
/* 84 */                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
/* 90 */                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                        }
                    }
/* 96 */            zzco.zzk(arrayList);
/* 105 */           if (jSONObject.has("fullPriceMicros")) {
/* 107 */               jSONObject.optLong("fullPriceMicros");
                    }
/* 112 */           JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
/* 116 */           if (jSONObjectOptJSONObject != null) {
/* 120 */               jSONObjectOptJSONObject.getInt("percentageDiscount");
                    }
/* 125 */           JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
/* 129 */           if (jSONObjectOptJSONObject2 != null) {
/* 133 */               jSONObjectOptJSONObject2.getLong("startTimeMillis");
/* 138 */               jSONObjectOptJSONObject2.getLong("endTimeMillis");
                    }
/* 143 */           JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
/* 147 */           if (jSONObjectOptJSONObject3 != null) {
/* 151 */               jSONObjectOptJSONObject3.getInt("maximumQuantity");
/* 156 */               jSONObjectOptJSONObject3.getInt("remainingQuantity");
                    }
/* 165 */           this.f19847d = jSONObject.optString("serializedDocid");
/* 169 */           JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
/* 173 */           if (jSONObjectOptJSONObject4 != null) {
/* 177 */               jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
/* 182 */               jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
                    }
/* 187 */           JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
/* 191 */           if (jSONObjectOptJSONObject5 != null) {
/* 195 */               jSONObjectOptJSONObject5.getString("rentalPeriod");
/* 204 */               jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
                    }
/* 209 */           JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
/* 213 */           if (jSONObjectOptJSONObject6 != null) {
/* 218 */               lf3Var = new lf3(1);
/* 223 */               jSONObjectOptJSONObject6.getString("type");
/* 228 */               JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("balanceThresholds");
/* 234 */               ArrayList arrayList2 = new ArrayList();
/* 237 */               if (jSONArrayOptJSONArray2 != null) {
/* 244 */                   for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
/* 254 */                       arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i2)));
                            }
                        }
/* 262 */               JSONArray jSONArray = jSONObjectOptJSONObject6.getJSONArray("pricingPhases");
/* 268 */               ArrayList arrayList3 = new ArrayList();
/* 271 */               if (jSONArray != null) {
/* 277 */                   for (int i3 = 0; i3 < jSONArray.length(); i3++) {
/* 279 */                       JSONObject jSONObjectOptJSONObject7 = jSONArray.optJSONObject(i3);
/* 283 */                       if (jSONObjectOptJSONObject7 != null) {
/* 290 */                           arrayList3.add(new ec0(jSONObjectOptJSONObject7));
                                }
                            }
                        }
                    }
/* 296 */           this.f19848e = lf3Var;
                }
            }
