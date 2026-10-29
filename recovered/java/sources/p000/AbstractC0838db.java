            package p000;

            import android.app.Activity;
            import android.content.ClipData;
            import android.os.Build;
            import android.text.Selection;
            import android.text.Spannable;
            import android.view.DragEvent;
            import android.view.View;
            import android.widget.TextView;
            
            /* JADX INFO: renamed from: db */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0838db {
                /* JADX INFO: renamed from: a */
                public static boolean m2982a(DragEvent dragEvent, TextView textView, Activity activity) {
                    i00 gr0Var;
/* 1 */             activity.requestDragAndDropPermissions(dragEvent);
/* 12 */            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
/* 16 */            textView.beginBatchEdit();
                    try {
/* 25 */                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
/* 28 */                ClipData clipData = dragEvent.getClipData();
/* 37 */                if (Build.VERSION.SDK_INT >= 31) {
/* 41 */                    gr0Var = new gr0(clipData, 3);
                        } else {
/* 47 */                    j00 j00Var = new j00();
/* 50 */                    j00Var.f11980b = clipData;
/* 52 */                    j00Var.f11981c = 3;
                            gr0Var = j00Var;
                        }
/* 58 */                e33.m3313i(textView, gr0Var.build());
/* 64 */                return true;
                    } finally {
/* 67 */                textView.endBatchEdit();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static boolean m2983b(DragEvent dragEvent, View view, Activity activity) {
                    i00 gr0Var;
/* 1 */             activity.requestDragAndDropPermissions(dragEvent);
/* 4 */             ClipData clipData = dragEvent.getClipData();
/* 13 */            if (Build.VERSION.SDK_INT >= 31) {
/* 17 */                gr0Var = new gr0(clipData, 3);
                    } else {
/* 23 */                j00 j00Var = new j00();
/* 26 */                j00Var.f11980b = clipData;
/* 28 */                j00Var.f11981c = 3;
                        gr0Var = j00Var;
                    }
/* 34 */            e33.m3313i(view, gr0Var.build());
/* 37 */            return true;
                }
            }
