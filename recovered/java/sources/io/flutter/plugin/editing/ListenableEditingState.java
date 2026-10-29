            package io.flutter.plugin.editing;

            import android.text.Editable;
            import android.text.Selection;
            import android.text.SpannableStringBuilder;
            import android.view.View;
            import android.view.inputmethod.BaseInputConnection;
            import io.flutter.Log;
            import io.flutter.embedding.engine.systemchannels.TextInputChannel;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class ListenableEditingState extends SpannableStringBuilder {
                private static final String TAG = "ListenableEditingState";
                private int mComposingEndWhenBeginBatchEdit;
                private int mComposingStartWhenBeginBatchEdit;
                private BaseInputConnection mDummyConnection;
                private int mSelectionEndWhenBeginBatchEdit;
                private int mSelectionStartWhenBeginBatchEdit;
                private String mTextWhenBeginBatchEdit;
                private String mToStringCache;
                private int mBatchEditNestDepth = 0;
                private int mChangeNotificationDepth = 0;
                private ArrayList<EditingStateWatcher> mListeners = new ArrayList<>();
                private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList<>();
                private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList<>();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface EditingStateWatcher {
                    void didChangeEditingState(boolean z, boolean z2, boolean z3);
                }

                public ListenableEditingState(TextInputChannel.TextEditState textEditState, View view) {
/* 36 */            this.mDummyConnection = new BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
                        @Override // android.view.inputmethod.BaseInputConnection
                        public Editable getEditable() {
/* 1 */                     return this;
                        }
                    };
/* 38 */            if (textEditState != null) {
/* 40 */                setEditingState(textEditState);
                    }
                }

                private void notifyListener(EditingStateWatcher editingStateWatcher, boolean z, boolean z2, boolean z3) {
/* 5 */             this.mChangeNotificationDepth++;
/* 7 */             editingStateWatcher.didChangeEditingState(z, z2, z3);
/* 14 */            this.mChangeNotificationDepth--;
                }

                private void notifyListenersIfNeeded(boolean z, boolean z2, boolean z3) {
/* 1 */             if (z || z2 || z3) {
/* 9 */                 Iterator<EditingStateWatcher> it = this.mListeners.iterator();
/* 17 */                while (it.hasNext()) {
/* 25 */                    notifyListener(it.next(), z, z2, z3);
                        }
                    }
                }

                public void addEditingStateListener(EditingStateWatcher editingStateWatcher) {
/* 5 */             if (this.mChangeNotificationDepth > 0) {
/* 30 */                Log.m4585e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
                    }
/* 35 */            if (this.mBatchEditNestDepth <= 0) {
/* 50 */                this.mListeners.add(editingStateWatcher);
                    } else {
/* 39 */                Log.m4591w(TAG, "a listener was added to EditingState while a batch edit was in progress");
/* 44 */                this.mPendingListeners.add(editingStateWatcher);
                    }
                }

                public void beginBatchEdit() {
/* 5 */             this.mBatchEditNestDepth++;
/* 9 */             if (this.mChangeNotificationDepth > 0) {
/* 15 */                Log.m4585e(TAG, "editing state should not be changed in a listener callback");
                    }
/* 20 */            if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
/* 60 */                return;
                    }
/* 34 */            this.mTextWhenBeginBatchEdit = toString();
/* 40 */            this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
/* 46 */            this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
/* 52 */            this.mComposingStartWhenBeginBatchEdit = getComposingStart();
/* 58 */            this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
                }

                public void clearBatchDeltas() {
/* 3 */             this.mBatchTextEditingDeltas.clear();
                }

                public void endBatchEdit() {
/* 1 */             int i = this.mBatchEditNestDepth;
/* 5 */             if (i == 0) {
/* 9 */                 Log.m4585e(TAG, "endBatchEdit called without a matching beginBatchEdit");
/* 12 */                return;
                    }
/* 14 */            if (i == 1) {
/* 18 */                Iterator<EditingStateWatcher> it = this.mPendingListeners.iterator();
/* 26 */                while (it.hasNext()) {
/* 34 */                    notifyListener(it.next(), true, true, true);
                        }
/* 44 */                if (!this.mListeners.isEmpty()) {
/* 75 */                    Log.m4589v(TAG, "didFinishBatchEdit with " + String.valueOf(this.mListeners.size()) + " listener(s)");
/* 127 */                   notifyListenersIfNeeded(!toString().equals(this.mTextWhenBeginBatchEdit), (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true, (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true);
                        }
                    }
/* 134 */           this.mListeners.addAll(this.mPendingListeners);
/* 139 */           this.mPendingListeners.clear();
/* 145 */           this.mBatchEditNestDepth--;
                }

                public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas() {
/* 5 */             ArrayList<TextEditingDelta> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
/* 10 */            this.mBatchTextEditingDeltas.clear();
/* 13 */            return arrayList;
                }

                public final int getComposingEnd() {
/* 1 */             return BaseInputConnection.getComposingSpanEnd(this);
                }

                public final int getComposingStart() {
/* 1 */             return BaseInputConnection.getComposingSpanStart(this);
                }

                public final int getSelectionEnd() {
/* 1 */             return Selection.getSelectionEnd(this);
                }

                public final int getSelectionStart() {
/* 1 */             return Selection.getSelectionStart(this);
                }

                public void removeEditingStateListener(EditingStateWatcher editingStateWatcher) {
/* 3 */             if (this.mChangeNotificationDepth > 0) {
/* 30 */                Log.m4585e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
                    }
/* 35 */            this.mListeners.remove(editingStateWatcher);
/* 40 */            if (this.mBatchEditNestDepth > 0) {
/* 44 */                this.mPendingListeners.remove(editingStateWatcher);
                    }
                }

                @Override // android.text.SpannableStringBuilder, android.text.Editable
                public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
/* 5 */             if (this.mChangeNotificationDepth > 0) {
/* 11 */                Log.m4585e(TAG, "editing state should not be changed in a listener callback");
                    }
/* 14 */            String string = toString();
/* 18 */            int i5 = i2 - i;
/* 26 */            boolean z = i5 != i4 - i3;
/* 28 */            for (int i6 = 0; i6 < i5 && !z; i6++) {
/* 51 */                z |= charAt(i + i6) != charSequence.charAt(i3 + i6);
                    }
/* 57 */            if (z) {
/* 60 */                this.mToStringCache = null;
                    }
/* 62 */            int selectionStart = getSelectionStart();
/* 66 */            int selectionEnd = getSelectionEnd();
/* 70 */            int composingStart = getComposingStart();
/* 74 */            int composingEnd = getComposingEnd();
/* 78 */            SpannableStringBuilder spannableStringBuilderReplace = super.replace(i, i2, charSequence, i3, i4);
/* 112 */           this.mBatchTextEditingDeltas.add(new TextEditingDelta(string, i, i2, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
/* 117 */           if (this.mBatchEditNestDepth > 0) {
/* 119 */               return spannableStringBuilderReplace;
                    }
/* 152 */           notifyListenersIfNeeded(z, (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true, (getComposingStart() == composingStart && getComposingEnd() == composingEnd) ? false : true);
/* 155 */           return spannableStringBuilderReplace;
                }

                public void setComposingRange(int i, int i2) {
/* 1 */             if (i < 0 || i >= i2) {
/* 12 */                BaseInputConnection.removeComposingSpans(this);
                    } else {
/* 8 */                 this.mDummyConnection.setComposingRegion(i, i2);
                    }
                }

                public void setEditingState(TextInputChannel.TextEditState textEditState) {
/* 1 */             beginBatchEdit();
/* 11 */            replace(0, length(), (CharSequence) textEditState.text);
/* 18 */            if (textEditState.hasSelection()) {
/* 24 */                Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
                    } else {
/* 28 */                Selection.removeSelection(this);
                    }
/* 35 */            setComposingRange(textEditState.composingStart, textEditState.composingEnd);
/* 38 */            clearBatchDeltas();
/* 41 */            endBatchEdit();
                }

                @Override // android.text.SpannableStringBuilder, android.text.Spannable
                public void setSpan(Object obj, int i, int i2, int i3) {
/* 1 */             super.setSpan(obj, i, i2, i3);
/* 31 */            this.mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
                }

                @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                public String toString() {
/* 1 */             String str = this.mToStringCache;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 6 */             String string = super.toString();
/* 10 */            this.mToStringCache = string;
/* 12 */            return string;
                }
            }
