            package io.flutter.plugin.editing;

            import android.content.ClipData;
            import android.content.ClipboardManager;
            import android.content.Context;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.DynamicLayout;
            import android.text.Editable;
            import android.text.Layout;
            import android.text.Selection;
            import android.text.TextPaint;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.inputmethod.BaseInputConnection;
            import android.view.inputmethod.CursorAnchorInfo;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.ExtractedText;
            import android.view.inputmethod.ExtractedTextRequest;
            import android.view.inputmethod.InputContentInfo;
            import android.view.inputmethod.InputMethodManager;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.systemchannels.ScribeChannel;
            import io.flutter.embedding.engine.systemchannels.TextInputChannel;
            import java.io.ByteArrayOutputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.HashMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 52 */    public class InputConnectionAdaptor extends BaseInputConnection implements ListenableEditingState.EditingStateWatcher {
                private static final String TAG = "InputConnectionAdaptor";
                private int batchEditNestDepth;
                private FlutterTextUtils flutterTextUtils;
                private final KeyboardDelegate keyboardDelegate;
                private final int mClient;
                private CursorAnchorInfo.Builder mCursorAnchorInfoBuilder;
                private final ListenableEditingState mEditable;
                private final EditorInfo mEditorInfo;
                private ExtractedTextRequest mExtractRequest;
                private ExtractedText mExtractedText;
                private final View mFlutterView;
                private InputMethodManager mImm;
                private final Layout mLayout;
                private boolean mMonitorCursorUpdate;
                private final ScribeChannel scribeChannel;
                private final TextInputChannel textInputChannel;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface KeyboardDelegate {
                    boolean handleEvent(KeyEvent keyEvent);
                }

                public InputConnectionAdaptor(View view, int i, TextInputChannel textInputChannel, ScribeChannel scribeChannel, KeyboardDelegate keyboardDelegate, ListenableEditingState listenableEditingState, EditorInfo editorInfo, FlutterJNI flutterJNI) {
/* 2 */             super(view, true);
/* 6 */             this.mMonitorCursorUpdate = false;
/* 13 */            this.mExtractedText = new ExtractedText();
/* 15 */            this.batchEditNestDepth = 0;
/* 17 */            this.mFlutterView = view;
/* 19 */            this.mClient = i;
/* 21 */            this.textInputChannel = textInputChannel;
/* 23 */            this.scribeChannel = scribeChannel;
/* 25 */            this.mEditable = listenableEditingState;
/* 27 */            listenableEditingState.addEditingStateListener(this);
/* 30 */            this.mEditorInfo = editorInfo;
/* 32 */            this.keyboardDelegate = keyboardDelegate;
/* 41 */            this.flutterTextUtils = new FlutterTextUtils(flutterJNI);
/* 63 */            this.mLayout = new DynamicLayout(listenableEditingState, new TextPaint(), AbstractC0208c9.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
/* 77 */            this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
                }

                private static int clampIndexToEditable(int i, Editable editable) {
/* 10 */            int iMax = Math.max(0, Math.min(editable.length(), i));
/* 14 */            if (iMax != i) {
/* 45 */                Log.m4583d("flutter", "Text selection index was clamped (" + i + "->" + iMax + ") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
                    }
/* 48 */            return iMax;
                }

                private boolean doPerformContextMenuAction(int i) {
/* 6 */             if (i == 16908319) {
/* 14 */                setSelection(0, this.mEditable.length());
/* 4 */                 return true;
                    }
/* 25 */            if (i == 16908320) {
/* 29 */                int selectionStart = Selection.getSelectionStart(this.mEditable);
/* 35 */                int selectionEnd = Selection.getSelectionEnd(this.mEditable);
/* 39 */                if (selectionStart != selectionEnd) {
/* 41 */                    int iMin = Math.min(selectionStart, selectionEnd);
/* 45 */                    int iMax = Math.max(selectionStart, selectionEnd);
/* 71 */                    ((ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.mEditable.subSequence(iMin, iMax)));
/* 76 */                    this.mEditable.delete(iMin, iMax);
/* 79 */                    setSelection(iMin, iMin);
                        }
/* 4 */                 return true;
                    }
/* 86 */            if (i == 16908321) {
/* 90 */                int selectionStart2 = Selection.getSelectionStart(this.mEditable);
/* 96 */                int selectionEnd2 = Selection.getSelectionEnd(this.mEditable);
/* 100 */               if (selectionStart2 != selectionEnd2) {
/* 132 */                   ((ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.mEditable.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                        }
/* 4 */                 return true;
                    }
/* 139 */           if (i != 16908322) {
/* 5 */                 return false;
                    }
/* 153 */           ClipData primaryClip = ((ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).getPrimaryClip();
/* 157 */           if (primaryClip != null) {
/* 169 */               CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(this.mFlutterView.getContext());
/* 179 */               int iMax2 = Math.max(0, Selection.getSelectionStart(this.mEditable));
/* 189 */               int iMax3 = Math.max(0, Selection.getSelectionEnd(this.mEditable));
/* 193 */               int iMin2 = Math.min(iMax2, iMax3);
/* 197 */               int iMax4 = Math.max(iMax2, iMax3);
/* 201 */               if (iMin2 != iMax4) {
/* 205 */                   this.mEditable.delete(iMin2, iMax4);
                        }
/* 210 */               this.mEditable.insert(iMin2, charSequenceCoerceToText);
/* 217 */               int length = charSequenceCoerceToText.length() + iMin2;
/* 218 */               setSelection(length, length);
                    }
/* 4 */             return true;
                }

                private CursorAnchorInfo getCursorAnchorInfo() {
/* 1 */             CursorAnchorInfo.Builder builder = this.mCursorAnchorInfoBuilder;
/* 3 */             if (builder == null) {
/* 10 */                this.mCursorAnchorInfoBuilder = new CursorAnchorInfo.Builder();
                    } else {
/* 13 */                builder.reset();
                    }
/* 30 */            this.mCursorAnchorInfoBuilder.setSelectionRange(this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd());
/* 35 */            int composingStart = this.mEditable.getComposingStart();
/* 41 */            int composingEnd = this.mEditable.getComposingEnd();
/* 45 */            if (composingStart < 0 || composingEnd <= composingStart) {
/* 70 */                this.mCursorAnchorInfoBuilder.setComposingText(-1, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
/* 61 */                this.mCursorAnchorInfoBuilder.setComposingText(composingStart, this.mEditable.toString().subSequence(composingStart, composingEnd));
                    }
/* 75 */            return this.mCursorAnchorInfoBuilder.build();
                }

                private ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest) {
/* 1 */             ExtractedText extractedText = this.mExtractedText;
/* 4 */             extractedText.startOffset = 0;
/* 7 */             extractedText.partialStartOffset = -1;
/* 9 */             extractedText.partialEndOffset = -1;
/* 17 */            extractedText.selectionStart = this.mEditable.getSelectionStart();
/* 27 */            this.mExtractedText.selectionEnd = this.mEditable.getSelectionEnd();
/* 49 */            this.mExtractedText.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.mEditable.toString() : this.mEditable;
/* 51 */            return this.mExtractedText;
                }

                private boolean handleHorizontalMovement(boolean z, boolean z2) {
/* 3 */             int selectionStart = Selection.getSelectionStart(this.mEditable);
/* 9 */             int selectionEnd = Selection.getSelectionEnd(this.mEditable);
/* 14 */            if (selectionStart < 0 || selectionEnd < 0) {
/* 13 */                return false;
                    }
/* 19 */            FlutterTextUtils flutterTextUtils = this.flutterTextUtils;
/* 46 */            int iMax = z ? Math.max(flutterTextUtils.getOffsetBefore(this.mEditable, selectionEnd), 0) : Math.min(flutterTextUtils.getOffsetAfter(this.mEditable, selectionEnd), this.mEditable.length());
/* 50 */            if (selectionStart != selectionEnd || z2) {
/* 58 */                setSelection(selectionStart, iMax);
/* 61 */                return true;
                    }
/* 54 */            setSelection(iMax, iMax);
/* 61 */            return true;
                }

                private boolean handleVerticalMovement(boolean z, boolean z2) {
/* 3 */             int selectionStart = Selection.getSelectionStart(this.mEditable);
/* 9 */             int selectionEnd = Selection.getSelectionEnd(this.mEditable);
/* 13 */            boolean z3 = false;
/* 14 */            if (selectionStart < 0 || selectionEnd < 0) {
/* 13 */                return false;
                    }
/* 20 */            if (selectionStart == selectionEnd && !z2) {
/* 24 */                z3 = true;
                    }
/* 25 */            beginBatchEdit();
/* 28 */            if (z3) {
/* 30 */                ListenableEditingState listenableEditingState = this.mEditable;
/* 32 */                if (z) {
/* 36 */                    Selection.moveUp(listenableEditingState, this.mLayout);
                        } else {
/* 42 */                    Selection.moveDown(listenableEditingState, this.mLayout);
                        }
/* 47 */                int selectionStart2 = Selection.getSelectionStart(this.mEditable);
/* 51 */                setSelection(selectionStart2, selectionStart2);
                    } else {
/* 55 */                ListenableEditingState listenableEditingState2 = this.mEditable;
/* 57 */                if (z) {
/* 61 */                    Selection.extendUp(listenableEditingState2, this.mLayout);
                        } else {
/* 67 */                    Selection.extendDown(listenableEditingState2, this.mLayout);
                        }
/* 82 */                setSelection(Selection.getSelectionStart(this.mEditable), Selection.getSelectionEnd(this.mEditable));
                    }
/* 85 */            endBatchEdit();
/* 19 */            return true;
                }

                private byte[] readStreamFully(InputStream inputStream, int i) {
                    int i2;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 6 */             byte[] bArr = new byte[i];
                    while (true) {
                        try {
/* 9 */                     i2 = inputStream.read(bArr);
                        } catch (IOException unused) {
/* 14 */                    i2 = -1;
                        }
/* 15 */                if (i2 == -1) {
/* 17 */                    return byteArrayOutputStream.toByteArray();
                        }
/* 23 */                byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean beginBatchEdit() {
/* 3 */             this.mEditable.beginBatchEdit();
/* 10 */            this.batchEditNestDepth++;
/* 12 */            return super.beginBatchEdit();
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean clearMetaKeyStates(int i) {
/* 1 */             return super.clearMetaKeyStates(i);
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public void closeConnection() {
/* 1 */             super.closeConnection();
/* 6 */             this.mEditable.removeEditingStateListener(this);
/* 11 */            while (this.batchEditNestDepth > 0) {
/* 13 */                endBatchEdit();
/* 20 */                this.batchEditNestDepth--;
                    }
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
/* 6 */             if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                        try {
/* 1 */                     inputContentInfo.requestPermission();
/* 23 */                    if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
/* 1 */                         inputContentInfo.requestPermission();
/* 1 */                         Uri contentUri = inputContentInfo.getContentUri();
/* 36 */                        String mimeType = inputContentInfo.getDescription().getMimeType(0);
/* 42 */                        Context context = this.mFlutterView.getContext();
/* 46 */                        if (contentUri != null) {
                                    try {
/* 52 */                                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
/* 56 */                                if (inputStreamOpenInputStream != null) {
/* 60 */                                    byte[] streamFully = readStreamFully(inputStreamOpenInputStream, 65536);
/* 66 */                                    HashMap map = new HashMap();
/* 71 */                                    map.put("mimeType", mimeType);
/* 76 */                                    map.put(SharedDataContentProvider.BASE_PATH, streamFully);
/* 85 */                                    map.put("uri", contentUri.toString());
/* 92 */                                    this.textInputChannel.commitContent(this.mClient, map);
/* 1 */                                     inputContentInfo.releasePermission();
/* 8 */                                     return true;
                                        }
                                    } catch (FileNotFoundException unused) {
/* 1 */                                 inputContentInfo.releasePermission();
/* 5 */                                 return false;
                                    }
                                }
/* 1 */                         inputContentInfo.releasePermission();
                            }
                        } catch (Exception unused2) {
                        }
                    }
/* 5 */             return false;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean commitText(CharSequence charSequence, int i) {
/* 1 */             return super.commitText(charSequence, i);
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean deleteSurroundingText(int i, int i2) {
/* 8 */             if (this.mEditable.getSelectionStart() == -1) {
/* 10 */                return true;
                    }
/* 12 */            return super.deleteSurroundingText(i, i2);
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
/* 1 */             return super.deleteSurroundingTextInCodePoints(i, i2);
                }

                @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
                public void didChangeEditingState(boolean z, boolean z2, boolean z3) {
/* 29 */            this.mImm.updateSelection(this.mFlutterView, this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd(), this.mEditable.getComposingStart(), this.mEditable.getComposingEnd());
/* 32 */            ExtractedTextRequest extractedTextRequest = this.mExtractRequest;
/* 34 */            if (extractedTextRequest != null) {
/* 46 */                this.mImm.updateExtractedText(this.mFlutterView, extractedTextRequest.token, getExtractedText(extractedTextRequest));
                    }
/* 51 */            if (this.mMonitorCursorUpdate) {
/* 61 */                this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
                    }
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean endBatchEdit() {
/* 1 */             boolean zEndBatchEdit = super.endBatchEdit();
/* 9 */             this.batchEditNestDepth--;
/* 13 */            this.mEditable.endBatchEdit();
/* 16 */            return zEndBatchEdit;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean finishComposingText() {
/* 1 */             return super.finishComposingText();
                }

                @Override // android.view.inputmethod.BaseInputConnection
                public Editable getEditable() {
/* 1 */             return this.mEditable;
                }

                public boolean handleKeyEvent(KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getAction() == 0) {
/* 15 */                if (keyEvent.getKeyCode() == 21) {
/* 21 */                    return handleHorizontalMovement(true, keyEvent.isShiftPressed());
                        }
/* 32 */                if (keyEvent.getKeyCode() == 22) {
/* 38 */                    return handleHorizontalMovement(false, keyEvent.isShiftPressed());
                        }
/* 49 */                if (keyEvent.getKeyCode() == 19) {
/* 55 */                    return handleVerticalMovement(true, keyEvent.isShiftPressed());
                        }
/* 66 */                if (keyEvent.getKeyCode() == 20) {
/* 72 */                    return handleVerticalMovement(false, keyEvent.isShiftPressed());
                        }
/* 83 */                if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
/* 93 */                    EditorInfo editorInfo = this.mEditorInfo;
/* 100 */                   if ((editorInfo.inputType & 131072) == 0) {
/* 106 */                       performEditorAction(editorInfo.imeOptions & 255);
/* 14 */                        return true;
                            }
                        }
/* 112 */               int selectionStart = Selection.getSelectionStart(this.mEditable);
/* 118 */               int selectionEnd = Selection.getSelectionEnd(this.mEditable);
/* 122 */               int unicodeChar = keyEvent.getUnicodeChar();
/* 126 */               if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
/* 133 */                   int iMin = Math.min(selectionStart, selectionEnd);
/* 137 */                   int iMax = Math.max(selectionStart, selectionEnd);
/* 141 */                   beginBatchEdit();
/* 144 */                   if (iMin != iMax) {
/* 148 */                       this.mEditable.delete(iMin, iMax);
                            }
/* 158 */                   this.mEditable.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
/* 161 */                   int i = iMin + 1;
/* 162 */                   setSelection(i, i);
/* 165 */                   endBatchEdit();
/* 14 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean performContextMenuAction(int i) {
/* 1 */             beginBatchEdit();
/* 4 */             boolean zDoPerformContextMenuAction = doPerformContextMenuAction(i);
/* 8 */             endBatchEdit();
/* 11 */            return zDoPerformContextMenuAction;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean performEditorAction(int i) {
/* 2 */             if (i == 0) {
/* 79 */                this.textInputChannel.unspecifiedAction(this.mClient);
                    } else if (i == 1) {
/* 71 */                this.textInputChannel.newline(this.mClient);
                    } else if (i == 2) {
/* 63 */                this.textInputChannel.m4612go(this.mClient);
                    } else if (i == 3) {
/* 55 */                this.textInputChannel.search(this.mClient);
                    } else if (i == 4) {
/* 47 */                this.textInputChannel.send(this.mClient);
                    } else if (i != 5) {
/* 18 */                TextInputChannel textInputChannel = this.textInputChannel;
/* 21 */                if (i != 7) {
/* 25 */                    textInputChannel.done(this.mClient);
                        } else {
/* 31 */                    textInputChannel.previous(this.mClient);
                        }
                    } else {
/* 39 */                this.textInputChannel.next(this.mClient);
                    }
/* 1 */             return true;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean performPrivateCommand(String str, Bundle bundle) {
/* 5 */             this.textInputChannel.performPrivateCommand(this.mClient, str, bundle);
/* 8 */             return true;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean requestCursorUpdates(int i) {
/* 3 */             if ((i & 1) != 0) {
/* 13 */                this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
                    }
/* 23 */            boolean z = (i & 2) != 0;
/* 26 */            if (z != this.mMonitorCursorUpdate) {
/* 43 */                Log.m4583d(TAG, "The input method toggled cursor monitoring ".concat(z ? "on" : "off"));
                    }
/* 46 */            this.mMonitorCursorUpdate = z;
/* 18 */            return true;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean sendKeyEvent(KeyEvent keyEvent) {
/* 3 */             return this.keyboardDelegate.handleEvent(keyEvent);
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean setComposingRegion(int i, int i2) {
/* 1 */             return super.setComposingRegion(i, i2);
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean setComposingText(CharSequence charSequence, int i) {
/* 1 */             beginBatchEdit();
/* 15 */            boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
/* 19 */            endBatchEdit();
/* 22 */            return zCommitText;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
                public boolean setSelection(int i, int i2) {
/* 1 */             beginBatchEdit();
/* 4 */             boolean selection = super.setSelection(i, i2);
/* 8 */             endBatchEdit();
/* 11 */            return selection;
                }

                @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
/* 53 */        public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
                    boolean z = (i & 1) != 0;
/* 54 */            if (z == (this.mExtractRequest == null)) {
                        Log.m4583d(TAG, "The input method toggled text monitoring ".concat(z ? "on" : "off"));
                    }
/* 56 */            this.mExtractRequest = z ? extractedTextRequest : null;
/* 57 */            return getExtractedText(extractedTextRequest);
                }

/* 79 */        public InputConnectionAdaptor(View view, int i, TextInputChannel textInputChannel, ScribeChannel scribeChannel, KeyboardDelegate keyboardDelegate, ListenableEditingState listenableEditingState, EditorInfo editorInfo) {
/* 80 */            this(view, i, textInputChannel, scribeChannel, keyboardDelegate, listenableEditingState, editorInfo, new FlutterJNI());
                }
            }
