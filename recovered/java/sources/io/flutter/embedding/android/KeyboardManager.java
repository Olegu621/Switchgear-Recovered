            package io.flutter.embedding.android;

            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import io.flutter.Log;
            import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
            import io.flutter.embedding.engine.systemchannels.KeyboardChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.editing.InputConnectionAdaptor;
            import java.util.HashSet;
            import java.util.Map;
            import p000.AbstractC0208c9;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class KeyboardManager implements InputConnectionAdaptor.KeyboardDelegate, KeyboardChannel.KeyboardMethodHandler {
                private static final String TAG = "KeyboardManager";
                private final HashSet<KeyEvent> redispatchedEvents = new HashSet<>();
                protected final Responder[] responders;
                private final ViewDelegate viewDelegate;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CharacterCombiner {
                    private int combiningCharacter = 0;

                    public Character applyCombiningCharacterToBaseCharacter(int i) {
/* 1 */                 char c = (char) i;
/* 4 */                 int i2 = Integer.MIN_VALUE & i;
/* 5 */                 int i3 = this.combiningCharacter;
/* 7 */                 if (i2 != 0) {
/* 12 */                    int i4 = i & AbstractC0208c9.API_PRIORITY_OTHER;
/* 13 */                    if (i3 != 0) {
/* 19 */                        this.combiningCharacter = KeyCharacterMap.getDeadChar(i3, i4);
                            } else {
/* 22 */                        this.combiningCharacter = i4;
                            }
                        } else if (i3 != 0) {
/* 27 */                    int deadChar = KeyCharacterMap.getDeadChar(i3, i);
/* 31 */                    if (deadChar > 0) {
/* 33 */                        c = (char) deadChar;
                            }
/* 35 */                    this.combiningCharacter = 0;
                        }
/* 37 */                return Character.valueOf(c);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class PerEventCallbackBuilder {
                    boolean isEventHandled = false;
                    final KeyEvent keyEvent;
                    int unrepliedCount;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public class Callback implements Responder.OnKeyEventHandledCallback {
                        boolean isCalled;

                        private Callback() {
/* 7 */                     this.isCalled = false;
                        }

                        @Override // io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback
                        public void onKeyEventHandled(boolean z) {
/* 3 */                     if (this.isCalled) {
/* 34 */                        f42.m3656l("The onKeyEventHandledCallback should be called exactly once.");
/* 37 */                        return;
                            }
/* 6 */                     this.isCalled = true;
/* 8 */                     PerEventCallbackBuilder perEventCallbackBuilder = PerEventCallbackBuilder.this;
/* 12 */                    int i = perEventCallbackBuilder.unrepliedCount - 1;
/* 13 */                    perEventCallbackBuilder.unrepliedCount = i;
/* 17 */                    boolean z2 = z | perEventCallbackBuilder.isEventHandled;
/* 18 */                    perEventCallbackBuilder.isEventHandled = z2;
/* 20 */                    if (i != 0 || z2) {
/* 31 */                        return;
                            }
/* 1 */                     KeyboardManager.this.onUnhandled(perEventCallbackBuilder.keyEvent);
                        }
                    }

                    public PerEventCallbackBuilder(KeyEvent keyEvent) {
/* 9 */                 this.unrepliedCount = KeyboardManager.this.responders.length;
/* 14 */                this.keyEvent = keyEvent;
                    }

                    public Responder.OnKeyEventHandledCallback buildCallback() {
/* 4 */                 return new Callback();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Responder {

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public interface OnKeyEventHandledCallback {
                        void onKeyEventHandled(boolean z);
                    }

                    void handleEvent(KeyEvent keyEvent, OnKeyEventHandledCallback onKeyEventHandledCallback);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ViewDelegate {
                    BinaryMessenger getBinaryMessenger();

                    boolean onTextInputKeyEvent(KeyEvent keyEvent);

                    void redispatch(KeyEvent keyEvent);
                }

                public KeyboardManager(ViewDelegate viewDelegate) {
/* 11 */            this.viewDelegate = viewDelegate;
/* 45 */            this.responders = new Responder[]{new KeyEmbedderResponder(viewDelegate.getBinaryMessenger()), new KeyChannelResponder(new KeyEventChannel(viewDelegate.getBinaryMessenger()))};
/* 56 */            new KeyboardChannel(viewDelegate.getBinaryMessenger()).setKeyboardMethodHandler(this);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void onUnhandled(KeyEvent keyEvent) {
/* 1 */             ViewDelegate viewDelegate = this.viewDelegate;
/* 3 */             if (viewDelegate == null || viewDelegate.onTextInputKeyEvent(keyEvent)) {
/* 37 */                return;
                    }
/* 14 */            this.redispatchedEvents.add(keyEvent);
/* 19 */            this.viewDelegate.redispatch(keyEvent);
/* 28 */            if (this.redispatchedEvents.remove(keyEvent)) {
/* 34 */                Log.m4591w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
                    }
                }

                public void destroy() {
/* 3 */             int size = this.redispatchedEvents.size();
/* 7 */             if (size > 0) {
/* 34 */                Log.m4591w(TAG, "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
                    }
                }

                @Override // io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler
                public Map<Long, Long> getKeyboardState() {
/* 8 */             return ((KeyEmbedderResponder) this.responders[0]).getPressedState();
                }

                @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
                public boolean handleEvent(KeyEvent keyEvent) {
/* 8 */             if (this.redispatchedEvents.remove(keyEvent)) {
/* 7 */                 return false;
                    }
/* 14 */            if (this.responders.length <= 0) {
/* 38 */                onUnhandled(keyEvent);
/* 41 */                return true;
                    }
/* 18 */            PerEventCallbackBuilder perEventCallbackBuilder = new PerEventCallbackBuilder(keyEvent);
/* 24 */            for (Responder responder : this.responders) {
/* 32 */                responder.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
                    }
/* 41 */            return true;
                }
            }
