            package io.flutter.plugin.editing;

            import io.flutter.Log;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class TextEditingDelta {
                private static final String TAG = "TextEditingDelta";
                private int deltaEnd;
                private int deltaStart;
                private CharSequence deltaText;
                private int newComposingEnd;
                private int newComposingStart;
                private int newSelectionEnd;
                private int newSelectionStart;
                private CharSequence oldText;

                public TextEditingDelta(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, int i4, int i5, int i6) {
/* 4 */             this.newSelectionStart = i3;
/* 6 */             this.newSelectionEnd = i4;
/* 8 */             this.newComposingStart = i5;
/* 10 */            this.newComposingEnd = i6;
/* 16 */            setDeltas(charSequence, charSequence2.toString(), i, i2);
                }

                private void setDeltas(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
/* 1 */             this.oldText = charSequence;
/* 3 */             this.deltaText = charSequence2;
/* 5 */             this.deltaStart = i;
/* 7 */             this.deltaEnd = i2;
                }

                public int getDeltaEnd() {
/* 1 */             return this.deltaEnd;
                }

                public int getDeltaStart() {
/* 1 */             return this.deltaStart;
                }

                public CharSequence getDeltaText() {
/* 1 */             return this.deltaText;
                }

                public int getNewComposingEnd() {
/* 1 */             return this.newComposingEnd;
                }

                public int getNewComposingStart() {
/* 1 */             return this.newComposingStart;
                }

                public int getNewSelectionEnd() {
/* 1 */             return this.newSelectionEnd;
                }

                public int getNewSelectionStart() {
/* 1 */             return this.newSelectionStart;
                }

                public CharSequence getOldText() {
/* 1 */             return this.oldText;
                }

                public JSONObject toJSON() {
/* 3 */             JSONObject jSONObject = new JSONObject();
                    try {
/* 14 */                jSONObject.put("oldText", this.oldText.toString());
/* 25 */                jSONObject.put("deltaText", this.deltaText.toString());
/* 32 */                jSONObject.put("deltaStart", this.deltaStart);
/* 39 */                jSONObject.put("deltaEnd", this.deltaEnd);
/* 46 */                jSONObject.put("selectionBase", this.newSelectionStart);
/* 53 */                jSONObject.put("selectionExtent", this.newSelectionEnd);
/* 60 */                jSONObject.put("composingBase", this.newComposingStart);
/* 67 */                jSONObject.put("composingExtent", this.newComposingEnd);
/* 70 */                return jSONObject;
                    } catch (JSONException e) {
/* 88 */                Log.m4585e(TAG, "unable to create JSONObject: " + e);
/* 91 */                return jSONObject;
                    }
                }

/* 19 */        public TextEditingDelta(CharSequence charSequence, int i, int i2, int i3, int i4) {
/* 21 */            this.newSelectionStart = i;
/* 22 */            this.newSelectionEnd = i2;
/* 23 */            this.newComposingStart = i3;
/* 24 */            this.newComposingEnd = i4;
/* 25 */            setDeltas(charSequence, HttpUrl.FRAGMENT_ENCODE_SET, -1, -1);
                }
            }
