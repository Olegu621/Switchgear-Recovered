            package p000;

            import android.os.Bundle;
            import android.text.Editable;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputConnectionWrapper;
            import android.widget.TextView;
            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zc0 extends InputConnectionWrapper {

                /* JADX INFO: renamed from: a */
                public final TextView f20068a;

                /* JADX INFO: renamed from: b */
                public final ec0 f20069b;

                public zc0(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
/* 4 */             ec0 ec0Var = new ec0(1);
/* 8 */             super(inputConnection, false);
/* 11 */            this.f20068a = textView;
/* 13 */            this.f20069b = ec0Var;
/* 17 */            if (sc0.f16512k != null) {
/* 19 */                sc0 sc0VarM8471a = sc0.m8471a();
/* 27 */                if (sc0VarM8471a.m8472b() != 1 || editorInfo == null) {
/* 31 */                    return;
                        }
/* 34 */                if (editorInfo.extras == null) {
/* 41 */                    editorInfo.extras = new Bundle();
                        }
/* 43 */                C0218cj c0218cj = sc0VarM8471a.f16517e;
/* 45 */                c0218cj.getClass();
/* 48 */                Bundle bundle = editorInfo.extras;
/* 56 */                ni1 ni1Var = (ni1) ((ra2) c0218cj.f2933c).f15955a;
/* 59 */                int iM8126a = ni1Var.m8126a(4);
/* 80 */                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM8126a != 0 ? ((ByteBuffer) ni1Var.f15965d).getInt(iM8126a + ni1Var.f15962a) : 0);
/* 87 */                editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
                    }
                }

                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean deleteSurroundingText(int i, int i2) {
/* 3 */             Editable editableText = this.f20068a.getEditableText();
/* 9 */             this.f20069b.getClass();
                    return ec0.m3400g(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
                }

                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
/* 3 */             Editable editableText = this.f20068a.getEditableText();
/* 9 */             this.f20069b.getClass();
                    return ec0.m3400g(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
                }
            }
