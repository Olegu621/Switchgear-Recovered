            package io.flutter.embedding.android;

            import android.view.KeyEvent;
            import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
            import p000.C2357x6;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class KeyChannelResponder implements KeyboardManager.Responder {
                private static final String TAG = "KeyChannelResponder";
                private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();
                private final KeyEventChannel keyEventChannel;

                public KeyChannelResponder(KeyEventChannel keyEventChannel) {
/* 11 */            this.keyEventChannel = keyEventChannel;
                }

                @Override // io.flutter.embedding.android.KeyboardManager.Responder
                public void handleEvent(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
/* 1 */             int action = keyEvent.getAction();
/* 7 */             if (action == 0 || action == 1) {
/* 41 */                this.keyEventChannel.sendFlutterKeyEvent(new KeyEventChannel.FlutterKeyEvent(keyEvent, this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar())), action != 0, new C2357x6(onKeyEventHandledCallback, 6));
                    } else {
/* 11 */                onKeyEventHandledCallback.onKeyEventHandled(false);
                    }
                }
            }
