            package io.flutter.plugin.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.nio.ByteBuffer;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class JSONMethodCodec implements MethodCodec {
                public static final JSONMethodCodec INSTANCE = new JSONMethodCodec();

                private JSONMethodCodec() {
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public Object decodeEnvelope(ByteBuffer byteBuffer) {
                    try {
/* 5 */                 Object objDecodeMessage = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
/* 11 */                if (objDecodeMessage instanceof JSONArray) {
/* 14 */                    JSONArray jSONArray = (JSONArray) objDecodeMessage;
/* 22 */                    if (jSONArray.length() == 1) {
/* 28 */                        return unwrapNull(jSONArray.opt(0));
                            }
/* 38 */                    if (jSONArray.length() == 3) {
/* 40 */                        Object obj = jSONArray.get(0);
/* 48 */                        Object objUnwrapNull = unwrapNull(jSONArray.opt(1));
/* 57 */                        Object objUnwrapNull2 = unwrapNull(jSONArray.opt(2));
/* 63 */                        if ((obj instanceof String) && (objUnwrapNull == null || (objUnwrapNull instanceof String))) {
/* 80 */                            throw new FlutterException((String) obj, (String) objUnwrapNull, objUnwrapNull2);
                                }
                            }
                        }
/* 98 */                throw new IllegalArgumentException("Invalid envelope: " + objDecodeMessage);
                    } catch (JSONException e) {
/* 107 */               throw new IllegalArgumentException("Invalid JSON", e);
                    }
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public MethodCall decodeMethodCall(ByteBuffer byteBuffer) {
                    try {
/* 5 */                 Object objDecodeMessage = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
/* 11 */                if (objDecodeMessage instanceof JSONObject) {
/* 14 */                    JSONObject jSONObject = (JSONObject) objDecodeMessage;
/* 18 */                    Object obj = jSONObject.get(FirebaseAnalytics.Param.METHOD);
/* 28 */                    Object objUnwrapNull = unwrapNull(jSONObject.opt("args"));
/* 34 */                    if (obj instanceof String) {
/* 40 */                        return new MethodCall((String) obj, objUnwrapNull);
                            }
                        }
/* 61 */                throw new IllegalArgumentException("Invalid method call: " + objDecodeMessage);
                    } catch (JSONException e) {
/* 70 */                throw new IllegalArgumentException("Invalid JSON", e);
                    }
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeErrorEnvelope(String str, String str2, Object obj) {
/* 28 */            return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(str).put(JSONUtil.wrap(str2)).put(JSONUtil.wrap(obj)));
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeErrorEnvelopeWithStacktrace(String str, String str2, Object obj, String str3) {
/* 36 */            return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(str).put(JSONUtil.wrap(str2)).put(JSONUtil.wrap(obj)).put(JSONUtil.wrap(str3)));
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeMethodCall(MethodCall methodCall) {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 10 */                jSONObject.put(FirebaseAnalytics.Param.METHOD, methodCall.method);
/* 21 */                jSONObject.put("args", JSONUtil.wrap(methodCall.arguments));
/* 26 */                return JSONMessageCodec.INSTANCE.encodeMessage(jSONObject);
                    } catch (JSONException e) {
/* 39 */                throw new IllegalArgumentException("Invalid JSON", e);
                    }
                }

                @Override // io.flutter.plugin.common.MethodCodec
                public ByteBuffer encodeSuccessEnvelope(Object obj) {
/* 16 */            return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(JSONUtil.wrap(obj)));
                }

                public Object unwrapNull(Object obj) {
/* 3 */             if (obj == JSONObject.NULL) {
/* 5 */                 return null;
                    }
/* 7 */             return obj;
                }
            }
