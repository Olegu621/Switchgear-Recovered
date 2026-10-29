            package io.flutter.plugin.editing;

            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.LocaleList;
            import android.text.Editable;
            import android.util.SparseArray;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewStructure;
            import android.view.autofill.AutofillId;
            import android.view.autofill.AutofillManager;
            import android.view.autofill.AutofillValue;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputMethodManager;
            import io.flutter.Log;
            import io.flutter.embedding.android.KeyboardManager;
            import io.flutter.embedding.engine.systemchannels.ScribeChannel;
            import io.flutter.embedding.engine.systemchannels.TextInputChannel;
            import io.flutter.plugin.platform.PlatformViewsController;
            import io.flutter.plugin.platform.PlatformViewsController2;
            import java.util.ArrayList;
            import java.util.HashMap;
            import okhttp3.internal.http2.Http2;
            import okhttp3.internal.http2.Http2Connection;
            import okio.Segment;
            import p000.AbstractC2053p0;
            import p000.de3;
            import p000.p30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
                private static final String TAG = "TextInputPlugin";
                private final AutofillManager afm;
                private SparseArray<TextInputChannel.Configuration> autofillConfiguration;
                private TextInputChannel.Configuration configuration;
                private ImeSyncDeferringInsetsCallback imeSyncCallback;
                private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
                private boolean isInputConnectionLocked;
                private Rect lastClientRect;
                private InputConnection lastInputConnection;
                private ListenableEditingState mEditable;
                private final InputMethodManager mImm;
                private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
                private boolean mRestartInputPending;
                private final View mView;
                private PlatformViewsController platformViewsController;
                private PlatformViewsController2 platformViewsController2;
                private final ScribeChannel scribeChannel;
                private final TextInputChannel textInputChannel;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class InputTarget {

                    /* JADX INFO: renamed from: id */
                    int f9763id;
                    Type type;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public enum Type {
                        NO_TARGET,
                        FRAMEWORK_CLIENT,
                        VIRTUAL_DISPLAY_PLATFORM_VIEW,
                        PHYSICAL_DISPLAY_PLATFORM_VIEW
                    }

                    public InputTarget(Type type, int i) {
/* 4 */                 this.type = type;
/* 6 */                 this.f9763id = i;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MinMax {
                    void inspect(double d, double d2);
                }

                public TextInputPlugin(View view, TextInputChannel textInputChannel, ScribeChannel scribeChannel, PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
/* 14 */            this.mView = view;
/* 22 */            this.mEditable = new ListenableEditingState(null, view);
/* 36 */            this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
/* 38 */            int i = Build.VERSION.SDK_INT;
/* 42 */            if (i >= 26) {
/* 60 */                this.afm = p30.m7301g(view.getContext().getSystemService(AbstractC2053p0.m7270k()));
                    } else {
/* 63 */                this.afm = null;
                    }
/* 67 */            if (i >= 30) {
/* 71 */                ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
/* 74 */                this.imeSyncCallback = imeSyncDeferringInsetsCallback;
/* 76 */                imeSyncDeferringInsetsCallback.install();
                    }
/* 79 */            this.textInputChannel = textInputChannel;
/* 86 */            textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void clearClient() {
/* 3 */                     TextInputPlugin.this.clearTextInputClient();
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void finishAutofillContext(boolean z) {
/* 5 */                     if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
/* 35 */                        return;
                            }
/* 16 */                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
/* 18 */                    if (z) {
/* 1 */                         textInputPlugin.afm.commit();
                            } else {
/* 1 */                         textInputPlugin.afm.cancel();
                            }
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void hide() {
/* 7 */                     InputTarget.Type type = TextInputPlugin.this.inputTarget.type;
/* 9 */                     InputTarget.Type type2 = InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW;
/* 11 */                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
/* 13 */                    if (type == type2) {
/* 1 */                         textInputPlugin.notifyViewExited();
                            } else {
/* 1 */                         textInputPlugin.hideTextInput(textInputPlugin.mView);
                            }
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void requestAutofill() {
/* 1 */                     TextInputPlugin.this.notifyViewEntered();
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void sendAppPrivateCommand(String str, Bundle bundle) {
/* 3 */                     TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void setClient(int i2, TextInputChannel.Configuration configuration) {
/* 3 */                     TextInputPlugin.this.setTextInputClient(i2, configuration);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void setEditableSizeAndTransform(double d, double d2, double[] dArr) {
/* 1 */                     TextInputPlugin.this.saveEditableSizeAndTransform(d, d2, dArr);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void setEditingState(TextInputChannel.TextEditState textEditState) {
/* 1 */                     TextInputPlugin textInputPlugin = TextInputPlugin.this;
/* 7 */                     textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void setPlatformViewClient(int i2, boolean z) {
/* 1 */                     TextInputPlugin.this.setPlatformViewTextInputClient(i2, z);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
                        public void show() {
/* 1 */                     TextInputPlugin textInputPlugin = TextInputPlugin.this;
/* 7 */                     textInputPlugin.showTextInput(textInputPlugin.mView);
                        }
                    });
/* 89 */            textInputChannel.requestExistingInputState();
/* 92 */            this.scribeChannel = scribeChannel;
/* 94 */            this.platformViewsController = platformViewsController;
/* 96 */            platformViewsController.attachTextInputPlugin(this);
/* 99 */            this.platformViewsController2 = platformViewsController2;
/* 101 */           platformViewsController2.attachTextInputPlugin(this);
                }

                private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
/* 5 */             int i = textEditState.composingEnd - textEditState.composingStart;
/* 12 */            if (i != textEditState2.composingEnd - textEditState2.composingStart) {
/* 11 */                return true;
                    }
/* 17 */            for (int i2 = 0; i2 < i; i2++) {
/* 37 */                if (textEditState.text.charAt(textEditState.composingStart + i2) != textEditState2.text.charAt(textEditState2.composingStart + i2)) {
/* 11 */                    return true;
                        }
                    }
/* 15 */            return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void hideTextInput(View view) {
/* 1 */             notifyViewExited();
/* 11 */            this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
                }

                /* JADX WARN: Code duplicated, block: B:59:0x0075  */
                /* JADX WARN: Code duplicated, block: B:61:0x0078  */
                /* JADX WARN: Code duplicated, block: B:63:0x007c  */
                /* JADX WARN: Code duplicated, block: B:65:0x007f  */
                /* JADX WARN: Code duplicated, block: B:67:0x0083  */
                /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
                private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z, boolean z2, boolean z3, boolean z4, TextInputChannel.TextCapitalization textCapitalization) {
                    int i;
                    int i2;
/* 1 */             TextInputChannel.TextInputType textInputType = inputType.type;
/* 5 */             if (textInputType == TextInputChannel.TextInputType.DATETIME) {
/* 7 */                 return 4;
                    }
/* 11 */            if (textInputType == TextInputChannel.TextInputType.NUMBER) {
/* 20 */                int i3 = inputType.isSigned ? 4098 : 2;
                        return inputType.isDecimal ? i3 | Segment.SIZE : i3;
                    }
/* 31 */            if (textInputType == TextInputChannel.TextInputType.PHONE) {
/* 33 */                return 3;
                    }
/* 37 */            if (textInputType == TextInputChannel.TextInputType.NONE) {
/* 39 */                return 0;
                    }
/* 43 */            if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
/* 45 */                i = 131073;
                    } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS || textInputType == TextInputChannel.TextInputType.TWITTER) {
/* 93 */                i = 33;
                    } else if (textInputType == TextInputChannel.TextInputType.URL || textInputType == TextInputChannel.TextInputType.WEB_SEARCH) {
/* 90 */                i = 17;
                    } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
/* 71 */                i = 145;
                    } else if (textInputType == TextInputChannel.TextInputType.NAME) {
/* 78 */                i = 97;
                    } else {
/* 88 */                i = textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
                    }
/* 95 */            if (!z) {
/* 102 */               if (z2) {
/* 107 */                   i |= 32768;
                        }
/* 108 */               i2 = z3 ? 524416 : 524432;
/* 116 */               if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
/* 118 */                   return i | 4096;
                        }
/* 123 */               if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
/* 125 */                   return i | Segment.SIZE;
                        }
/* 130 */               if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
/* 132 */                   return i | Http2.INITIAL_MAX_FRAME_SIZE;
                        }
/* 134 */               return i;
                    }
/* 100 */           i |= i2;
/* 116 */           if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
/* 118 */               return i | 4096;
                    }
/* 123 */           if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
/* 125 */               return i | Segment.SIZE;
                    }
/* 130 */           if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
/* 132 */               return i | Http2.INITIAL_MAX_FRAME_SIZE;
                    }
/* 134 */           return i;
                }

                private boolean needsAutofill() {
                    return this.autofillConfiguration != null;
                }

                private void notifyValueChanged(String str) {
/* 5 */             if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
/* 39 */                return;
                    }
/* 1 */             this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(str));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void notifyViewEntered() {
/* 5 */             if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
/* 59 */                return;
                    }
/* 22 */            String str = this.configuration.autofill.uniqueIdentifier;
/* 25 */            int[] iArr = new int[2];
/* 29 */            this.mView.getLocationOnScreen(iArr);
/* 36 */            Rect rect = new Rect(this.lastClientRect);
/* 45 */            rect.offset(iArr[0], iArr[1]);
/* 1 */             this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void notifyViewExited() {
                    TextInputChannel.Configuration configuration;
/* 5 */             if (Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
/* 43 */                return;
                    }
/* 1 */             this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void saveEditableSizeAndTransform(double d, double d2, final double[] dArr) {
/* 10 */            final double[] dArr2 = new double[4];
/* 42 */            final boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
/* 45 */            double d3 = dArr[12];
/* 47 */            double d4 = dArr[15];
/* 49 */            double d5 = d3 / d4;
/* 51 */            dArr2[1] = d5;
/* 53 */            dArr2[0] = d5;
/* 59 */            double d6 = dArr[13] / d4;
/* 61 */            dArr2[3] = d6;
/* 64 */            dArr2[2] = d6;
/* 68 */            MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
                        @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
                        public void inspect(double d7, double d8) {
/* 3 */                     double d9 = 1.0d;
/* 6 */                     if (!z) {
/* 9 */                         double[] dArr3 = dArr;
/* 24 */                        d9 = 1.0d / (((dArr3[7] * d8) + (dArr3[3] * d7)) + dArr3[15]);
                            }
/* 25 */                    double[] dArr4 = dArr;
/* 41 */                    double d10 = ((dArr4[4] * d8) + (dArr4[0] * d7) + dArr4[12]) * d9;
/* 56 */                    double d11 = ((dArr4[5] * d8) + (dArr4[1] * d7) + dArr4[13]) * d9;
/* 57 */                    double[] dArr5 = dArr2;
/* 63 */                    if (d10 < dArr5[0]) {
/* 65 */                        dArr5[0] = d10;
                            } else if (d10 > dArr5[1]) {
/* 74 */                        dArr5[1] = d10;
                            }
/* 81 */                    if (d11 < dArr5[2]) {
/* 83 */                        dArr5[2] = d11;
                            } else if (d11 > dArr5[3]) {
/* 92 */                        dArr5[3] = d11;
                            }
                        }
                    };
/* 71 */            minMax.inspect(d, 0.0d);
/* 74 */            minMax.inspect(d, d2);
/* 77 */            minMax.inspect(0.0d, d2);
/* 94 */            double d7 = this.mView.getContext().getResources().getDisplayMetrics().density;
/* 126 */           this.lastClientRect = new Rect((int) (dArr2[0] * d7), (int) (dArr2[2] * d7), (int) Math.ceil(dArr2[1] * d7), (int) Math.ceil(dArr2[3] * d7));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPlatformViewTextInputClient(int i, boolean z) {
/* 1 */             if (!z) {
/* 35 */                this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
/* 38 */                this.lastInputConnection = null;
                    } else {
/* 5 */                 this.mView.requestFocus();
/* 15 */                this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
/* 21 */                this.mImm.restartInput(this.mView);
/* 25 */                this.mRestartInputPending = false;
                    }
                }

                private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
/* 5 */             if (Build.VERSION.SDK_INT < 26) {
/* 83 */                return;
                    }
/* 8 */             if (configuration == null || configuration.autofill == null) {
/* 85 */                this.autofillConfiguration = null;
/* 87 */                return;
                    }
/* 15 */            TextInputChannel.Configuration[] configurationArr = configuration.fields;
/* 19 */            SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
/* 22 */            this.autofillConfiguration = sparseArray;
/* 24 */            if (configurationArr == null) {
/* 34 */                sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
/* 37 */                return;
                    }
/* 40 */            for (TextInputChannel.Configuration configuration2 : configurationArr) {
/* 44 */                TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
/* 46 */                if (autofill != null) {
/* 56 */                    this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
/* 1 */                     this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
                        }
                    }
                }

                public void autofill(SparseArray<AutofillValue> sparseArray) {
                    TextInputChannel.Configuration configuration;
                    TextInputChannel.Configuration.Autofill autofill;
                    TextInputChannel.Configuration.Autofill autofill2;
/* 5 */             if (Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
/* 116 */               return;
                    }
/* 23 */            HashMap<String, TextInputChannel.TextEditState> map = new HashMap<>();
/* 31 */            for (int i = 0; i < sparseArray.size(); i++) {
/* 39 */                TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i));
/* 45 */                if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
/* 64 */                    String string = p30.m7303i(sparseArray.valueAt(i)).getTextValue().toString();
/* 80 */                    TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(string, string.length(), string.length(), -1, -1);
/* 91 */                    if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
/* 95 */                        this.mEditable.setEditingState(textEditState);
                            } else {
/* 101 */                       map.put(autofill2.uniqueIdentifier, textEditState);
                            }
                        }
                    }
/* 113 */           this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f9763id, map);
                }

                public void clearPlatformViewClient(int i) {
/* 1 */             InputTarget inputTarget = this.inputTarget;
/* 3 */             InputTarget.Type type = inputTarget.type;
/* 7 */             if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f9763id == i) {
/* 25 */                this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
/* 27 */                notifyViewExited();
/* 38 */                this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
/* 45 */                this.mImm.restartInput(this.mView);
/* 48 */                this.mRestartInputPending = false;
                    }
                }

                public void clearTextInputClient() {
/* 7 */             if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
/* 9 */                 return;
                    }
/* 12 */            this.mEditable.removeEditingStateListener(this);
/* 15 */            notifyViewExited();
/* 19 */            this.configuration = null;
/* 21 */            updateAutofillConfigurationIfNeeded(null);
/* 32 */            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
/* 34 */            unlockPlatformViewInputConnection();
/* 37 */            this.lastClientRect = null;
                }

                public InputConnection createInputConnection(View view, KeyboardManager keyboardManager, EditorInfo editorInfo) {
                    int iIntValue;
/* 1 */             InputTarget inputTarget = this.inputTarget;
/* 3 */             InputTarget.Type type = inputTarget.type;
/* 8 */             if (type == InputTarget.Type.NO_TARGET) {
/* 10 */                this.lastInputConnection = null;
/* 7 */                 return null;
                    }
/* 15 */            if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
/* 7 */                 return null;
                    }
/* 20 */            if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
/* 24 */                if (this.isInputConnectionLocked) {
/* 26 */                    return this.lastInputConnection;
                        }
/* 37 */                InputConnection inputConnectionOnCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.f9763id).onCreateInputConnection(editorInfo);
/* 41 */                this.lastInputConnection = inputConnectionOnCreateInputConnection;
/* 43 */                return inputConnectionOnCreateInputConnection;
                    }
/* 44 */            TextInputChannel.Configuration configuration = this.configuration;
/* 58 */            int iInputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
/* 62 */            editorInfo.inputType = iInputTypeFromTextInputType;
/* 66 */            editorInfo.imeOptions = 33554432;
/* 68 */            int i = Build.VERSION.SDK_INT;
/* 72 */            if (i >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
/* 83 */                editorInfo.imeOptions = 33554432 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                    }
/* 87 */            Integer num = this.configuration.inputAction;
/* 90 */            if (num == null) {
/* 99 */                iIntValue = (iInputTypeFromTextInputType & 131072) != 0 ? 1 : 6;
                    } else {
/* 101 */               iIntValue = num.intValue();
                    }
/* 105 */           TextInputChannel.Configuration configuration2 = this.configuration;
/* 107 */           String str = configuration2.actionLabel;
/* 109 */           if (str != null) {
/* 111 */               editorInfo.actionLabel = str;
/* 113 */               editorInfo.actionId = iIntValue;
                    }
/* 118 */           editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
/* 122 */           if (configuration2.hintLocales != null) {
/* 133 */               editorInfo.hintLocales = new LocaleList(this.configuration.hintLocales);
                    }
/* 137 */           String[] strArr = this.configuration.contentCommitMimeTypes;
/* 139 */           if (strArr != null) {
/* 141 */               de3.m3017E(editorInfo, strArr);
                    }
/* 146 */           if (i >= 34) {
/* 150 */               if (editorInfo.extras == null) {
/* 157 */                   editorInfo.extras = new Bundle();
                        }
/* 163 */               editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                    }
/* 181 */           InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.f9763id, this.textInputChannel, this.scribeChannel, keyboardManager, this.mEditable, editorInfo);
/* 190 */           editorInfo.initialSelStart = this.mEditable.getSelectionStart();
/* 198 */           editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
/* 200 */           this.lastInputConnection = inputConnectionAdaptor;
/* 202 */           return inputConnectionAdaptor;
                }

                public void destroy() {
/* 3 */             this.platformViewsController.detachTextInputPlugin();
/* 8 */             this.platformViewsController2.detachTextInputPlugin();
/* 14 */            this.textInputChannel.setTextInputMethodHandler(null);
/* 17 */            notifyViewExited();
/* 22 */            this.mEditable.removeEditingStateListener(this);
/* 25 */            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
/* 27 */            if (imeSyncDeferringInsetsCallback != null) {
/* 29 */                imeSyncDeferringInsetsCallback.remove();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
                
                    if (r5 == r9.composingEnd) goto L23;
                 */
                @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void didChangeEditingState(boolean z, boolean z2, boolean z3) {
/* 1 */             if (z) {
/* 9 */                 notifyValueChanged(this.mEditable.toString());
                    }
/* 14 */            int selectionStart = this.mEditable.getSelectionStart();
/* 20 */            int selectionEnd = this.mEditable.getSelectionEnd();
/* 26 */            int composingStart = this.mEditable.getComposingStart();
/* 32 */            int composingEnd = this.mEditable.getComposingEnd();
/* 38 */            ArrayList<TextEditingDelta> arrayListExtractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
/* 44 */            if (this.mLastKnownFrameworkTextEditingState != null) {
/* 60 */                if (this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.text)) {
/* 62 */                    TextInputChannel.TextEditState textEditState = this.mLastKnownFrameworkTextEditingState;
/* 66 */                    if (selectionStart == textEditState.selectionStart) {
/* 70 */                        if (selectionEnd == textEditState.selectionEnd) {
/* 74 */                            if (composingStart == textEditState.composingStart) {
                                    }
                                }
                            }
                        }
/* 103 */               Log.m4589v(TAG, "send EditingState to flutter: " + this.mEditable.toString());
/* 108 */               boolean z4 = this.configuration.enableDeltaModel;
/* 110 */               TextInputChannel textInputChannel = this.textInputChannel;
/* 112 */               if (z4) {
/* 118 */                   textInputChannel.updateEditingStateWithDeltas(this.inputTarget.f9763id, arrayListExtractBatchTextEditingDeltas);
/* 123 */                   this.mEditable.clearBatchDeltas();
                        } else {
/* 142 */                   textInputChannel.updateEditingState(this.inputTarget.f9763id, this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
/* 145 */                   selectionStart = selectionStart;
/* 146 */                   selectionEnd = selectionEnd;
/* 147 */                   composingStart = composingStart;
/* 148 */                   composingEnd = composingEnd;
                        }
/* 160 */               this.mLastKnownFrameworkTextEditingState = new TextInputChannel.TextEditState(this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
/* 162 */               return;
                    }
/* 165 */           this.mEditable.clearBatchDeltas();
                }

                public Editable getEditable() {
/* 1 */             return this.mEditable;
                }

                public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
/* 1 */             return this.imeSyncCallback;
                }

                public InputMethodManager getInputMethodManager() {
/* 1 */             return this.mImm;
                }

                public InputConnection getLastInputConnection() {
/* 1 */             return this.lastInputConnection;
                }

                public boolean handleKeyEvent(KeyEvent keyEvent) {
                    InputConnection inputConnection;
/* 9 */             if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
/* 32 */                return false;
                    }
                    return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
                }

                public void lockPlatformViewInputConnection() {
/* 7 */             if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
/* 10 */                this.isInputConnectionLocked = true;
                    }
                }

                public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
                    Rect rect;
/* 5 */             if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
/* 148 */               return;
                    }
/* 19 */            String str = this.configuration.autofill.uniqueIdentifier;
/* 1 */             AutofillId autofillId = viewStructure.getAutofillId();
/* 33 */            for (int i2 = 0; i2 < this.autofillConfiguration.size(); i2++) {
/* 37 */                int iKeyAt = this.autofillConfiguration.keyAt(i2);
/* 49 */                TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i2).autofill;
/* 51 */                if (autofill != null) {
/* 55 */                    viewStructure.addChildCount(1);
/* 58 */                    ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
/* 1 */                     viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
/* 65 */                    String[] strArr = autofill.hints;
/* 68 */                    if (strArr.length > 0) {
/* 1 */                         viewStructureNewChild.setAutofillHints(strArr);
                            }
/* 2 */                     viewStructureNewChild.setAutofillType(1);
/* 76 */                    viewStructureNewChild.setVisibility(0);
/* 79 */                    String str2 = autofill.hintText;
/* 81 */                    if (str2 != null) {
/* 83 */                        viewStructureNewChild.setHint(str2);
                            }
/* 90 */                    if (str.hashCode() != iKeyAt || (rect = this.lastClientRect) == null) {
/* 131 */                       viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
/* 1 */                         viewStructureNewChild.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                            } else {
/* 112 */                       viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
/* 1 */                         viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                            }
                        }
                    }
                }

                public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
/* 5 */             this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
                }

                public void setTextInputClient(int i, TextInputChannel.Configuration configuration) {
/* 1 */             notifyViewExited();
/* 4 */             this.configuration = configuration;
/* 13 */            this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i);
/* 17 */            this.mEditable.removeEditingStateListener(this);
/* 22 */            TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
/* 36 */            this.mEditable = new ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
/* 38 */            updateAutofillConfigurationIfNeeded(configuration);
/* 42 */            this.mRestartInputPending = true;
/* 44 */            unlockPlatformViewInputConnection();
/* 47 */            this.lastClientRect = null;
/* 51 */            this.mEditable.addEditingStateListener(this);
                }

                public void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
                    TextInputChannel.TextEditState textEditState2;
/* 3 */             if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
/* 17 */                boolean zComposingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
/* 21 */                this.mRestartInputPending = zComposingChanged;
/* 23 */                if (zComposingChanged) {
/* 29 */                    Log.m4587i(TAG, "Composing region changed by the framework. Restarting the input method.");
                        }
                    }
/* 32 */            this.mLastKnownFrameworkTextEditingState = textEditState;
/* 36 */            this.mEditable.setEditingState(textEditState);
/* 41 */            if (this.mRestartInputPending) {
/* 45 */                this.mImm.restartInput(view);
/* 49 */                this.mRestartInputPending = false;
                    }
                }

                public void showTextInput(View view) {
                    TextInputChannel.InputType inputType;
/* 1 */             TextInputChannel.Configuration configuration = this.configuration;
/* 3 */             if (configuration != null && (inputType = configuration.inputType) != null && inputType.type == TextInputChannel.TextInputType.NONE) {
/* 16 */                hideTextInput(view);
                    } else {
/* 20 */                view.requestFocus();
/* 26 */                this.mImm.showSoftInput(view, 0);
                    }
                }

                public void unlockPlatformViewInputConnection() {
/* 7 */             if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
/* 10 */                this.isInputConnectionLocked = false;
                    }
                }
            }
