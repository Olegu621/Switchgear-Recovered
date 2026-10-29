            package io.flutter.plugin.common;

            import java.nio.ByteBuffer;
            import org.json.JSONException;
            import org.json.JSONObject;
            import org.json.JSONTokener;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class JSONMessageCodec implements MessageCodec<Object> {
                public static final JSONMessageCodec INSTANCE = new JSONMessageCodec();

                private JSONMessageCodec() {
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public Object decodeMessage(ByteBuffer byteBuffer) {
/* 3 */             if (byteBuffer == null) {
/* 5 */                 return null;
                    }
                    try {
/* 15 */                JSONTokener jSONTokener = new JSONTokener(StringCodec.INSTANCE.decodeMessage(byteBuffer));
/* 18 */                Object objNextValue = jSONTokener.nextValue();
/* 26 */                if (jSONTokener.more()) {
/* 34 */                    throw new IllegalArgumentException("Invalid JSON");
                        }
/* 28 */                return objNextValue;
                    } catch (JSONException e) {
/* 41 */                throw new IllegalArgumentException("Invalid JSON", e);
                    }
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public ByteBuffer encodeMessage(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 5 */             Object objWrap = JSONUtil.wrap(obj);
                    return objWrap instanceof String ? StringCodec.INSTANCE.encodeMessage(JSONObject.quote((String) objWrap)) : StringCodec.INSTANCE.encodeMessage(objWrap.toString());
                }
            }
