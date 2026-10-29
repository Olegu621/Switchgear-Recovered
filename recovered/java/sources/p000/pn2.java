            package p000;

            import android.content.ClipData;
            import android.content.Context;
            import android.text.Editable;
            import android.text.Selection;
            import android.text.Spanned;
            import android.util.Log;
            import android.view.View;
            import android.widget.TextView;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pn2 implements cq1 {
                /* JADX INFO: renamed from: a */
                public final l00 m7507a(View view, l00 l00Var) {
                    CharSequence charSequenceCoerceToStyledText;
/* 8 */             if (Log.isLoggable("ReceiveContent", 3)) {
/* 10 */                Objects.toString(l00Var);
                    }
/* 13 */            k00 k00Var = l00Var.f13067a;
/* 20 */            if (k00Var.mo5630e() == 2) {
/* 22 */                return l00Var;
                    }
/* 23 */            ClipData clipDataMo5628a = k00Var.mo5628a();
/* 27 */            int flags = k00Var.getFlags();
/* 31 */            TextView textView = (TextView) view;
/* 37 */            Editable editable = (Editable) textView.getText();
/* 39 */            Context context = textView.getContext();
/* 45 */            boolean z = false;
/* 50 */            for (int i = 0; i < clipDataMo5628a.getItemCount(); i++) {
/* 52 */                ClipData.Item itemAt = clipDataMo5628a.getItemAt(i);
/* 59 */                if ((flags & 1) != 0) {
/* 61 */                    charSequenceCoerceToStyledText = itemAt.coerceToText(context);
/* 67 */                    if (charSequenceCoerceToStyledText instanceof Spanned) {
/* 69 */                        charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                            }
                        } else {
/* 74 */                    charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
                        }
/* 78 */                if (charSequenceCoerceToStyledText != null) {
/* 80 */                    if (z) {
/* 120 */                       editable.insert(Selection.getSelectionEnd(editable), "\n");
/* 127 */                       editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                            } else {
/* 82 */                        int selectionStart = Selection.getSelectionStart(editable);
/* 86 */                        int selectionEnd = Selection.getSelectionEnd(editable);
/* 94 */                        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
/* 102 */                       int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
/* 106 */                       Selection.setSelection(editable, iMax2);
/* 109 */                       editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
/* 112 */                       z = true;
                            }
                        }
                    }
/* 133 */           return null;
                }
            }
