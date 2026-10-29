            package io.flutter.plugin.platform;

            import android.app.AlertDialog;
            import android.app.Presentation;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.MutableContextWrapper;
            import android.graphics.drawable.ColorDrawable;
            import android.os.Bundle;
            import android.view.Display;
            import android.view.View;
            import android.view.WindowManager;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.inputmethod.InputMethodManager;
            import android.widget.FrameLayout;
            import io.flutter.Log;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    class SingleViewPresentation extends Presentation {
                private static final String TAG = "PlatformViewsController";
                private final AccessibilityEventsDelegate accessibilityEventsDelegate;
                private FrameLayout container;
                private final View.OnFocusChangeListener focusChangeListener;
                private final Context outerContext;
                private AccessibilityDelegatingFrameLayout rootView;
                private boolean startFocused;
                private final PresentationState state;
                private int viewId;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class AccessibilityDelegatingFrameLayout extends FrameLayout {
                    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
                    private final View embeddedView;

                    public AccessibilityDelegatingFrameLayout(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, View view) {
/* 1 */                 super(context);
/* 4 */                 this.accessibilityEventsDelegate = accessibilityEventsDelegate;
/* 6 */                 this.embeddedView = view;
                    }

                    @Override // android.view.ViewGroup, android.view.ViewParent
                    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 5 */                 return this.accessibilityEventsDelegate.requestSendAccessibilityEvent(this.embeddedView, view, accessibilityEvent);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PresentationContext extends ContextWrapper {
                    private final Context flutterAppWindowContext;
                    private WindowManager windowManager;
                    private final WindowManagerHandler windowManagerHandler;

                    public PresentationContext(Context context, WindowManagerHandler windowManagerHandler, Context context2) {
/* 1 */                 super(context);
/* 4 */                 this.windowManagerHandler = windowManagerHandler;
/* 6 */                 this.flutterAppWindowContext = context2;
                    }

                    private WindowManager getWindowManager() {
/* 3 */                 if (this.windowManager == null) {
/* 7 */                     this.windowManager = this.windowManagerHandler;
                        }
/* 9 */                 return this.windowManager;
                    }

                    private boolean isCalledFromAlertDialog() {
/* 5 */                 StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
/* 12 */                for (int i = 0; i < stackTrace.length && i < 11; i++) {
/* 34 */                    if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
/* 50 */                        return true;
                            }
                        }
/* 9 */                 return false;
                    }

                    @Override // android.content.ContextWrapper, android.content.Context
                    public Object getSystemService(String str) {
/* 7 */                 if ("window".equals(str)) {
                            return isCalledFromAlertDialog() ? this.flutterAppWindowContext.getSystemService(str) : getWindowManager();
                        }
/* 27 */                return super.getSystemService(str);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PresentationState {
                    private SingleViewFakeWindowViewGroup fakeWindowViewGroup;
                    private PlatformView platformView;
                    private WindowManagerHandler windowManagerHandler;
                }

                public SingleViewPresentation(Context context, Display display, PlatformView platformView, AccessibilityEventsDelegate accessibilityEventsDelegate, int i, View.OnFocusChangeListener onFocusChangeListener) {
/* 6 */             super(new ImmContext(context), display);
/* 10 */            this.startFocused = false;
/* 12 */            this.accessibilityEventsDelegate = accessibilityEventsDelegate;
/* 14 */            this.viewId = i;
/* 16 */            this.focusChangeListener = onFocusChangeListener;
/* 18 */            this.outerContext = context;
/* 22 */            PresentationState presentationState = new PresentationState();
/* 25 */            this.state = presentationState;
/* 1 */             presentationState.platformView = platformView;
/* 36 */            getWindow().setFlags(8, 8);
/* 45 */            getWindow().setType(2030);
                }

                public PresentationState detachState() {
/* 1 */             FrameLayout frameLayout = this.container;
/* 3 */             if (frameLayout != null) {
/* 5 */                 frameLayout.removeAllViews();
                    }
/* 8 */             AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = this.rootView;
/* 10 */            if (accessibilityDelegatingFrameLayout != null) {
/* 12 */                accessibilityDelegatingFrameLayout.removeAllViews();
                    }
/* 15 */            return this.state;
                }

                public PlatformView getView() {
/* 1 */             return this.state.platformView;
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 14 */            getWindow().setBackgroundDrawable(new ColorDrawable(0));
/* 23 */            if (this.state.fakeWindowViewGroup == null) {
/* 1 */                 this.state.fakeWindowViewGroup = new SingleViewFakeWindowViewGroup(getContext());
                    }
/* 45 */            if (this.state.windowManagerHandler == null) {
/* 57 */                WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
/* 59 */                PresentationState presentationState = this.state;
/* 1 */                 presentationState.windowManagerHandler = new WindowManagerHandler(windowManager, presentationState.fakeWindowViewGroup);
                    }
/* 82 */            this.container = new FrameLayout(getContext());
/* 98 */            PresentationContext presentationContext = new PresentationContext(getContext(), this.state.windowManagerHandler, this.outerContext);
/* 107 */           View view = this.state.platformView.getView();
/* 117 */           if (view.getContext() instanceof MutableContextWrapper) {
/* 125 */               ((MutableContextWrapper) view.getContext()).setBaseContext(presentationContext);
                    } else {
/* 152 */               Log.m4591w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
                    }
/* 157 */           this.container.addView(view);
/* 168 */           AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = new AccessibilityDelegatingFrameLayout(getContext(), this.accessibilityEventsDelegate, view);
/* 171 */           this.rootView = accessibilityDelegatingFrameLayout;
/* 175 */           accessibilityDelegatingFrameLayout.addView(this.container);
/* 186 */           this.rootView.addView(this.state.fakeWindowViewGroup);
/* 191 */           view.setOnFocusChangeListener(this.focusChangeListener);
/* 197 */           this.rootView.setFocusableInTouchMode(true);
/* 202 */           if (this.startFocused) {
/* 204 */               view.requestFocus();
                    } else {
/* 210 */               this.rootView.requestFocus();
                    }
/* 215 */           setContentView(this.rootView);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 17 */        public static class ImmContext extends ContextWrapper {
                    private final InputMethodManager inputMethodManager;

                    private ImmContext(Context context, InputMethodManager inputMethodManager) {
/* 1 */                 super(context);
/* 16 */                this.inputMethodManager = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
                    }

                    @Override // android.content.ContextWrapper, android.content.Context
                    public Context createDisplayContext(Display display) {
/* 9 */                 return new ImmContext(super.createDisplayContext(display), this.inputMethodManager);
                    }

                    @Override // android.content.ContextWrapper, android.content.Context
                    public Object getSystemService(String str) {
                        return "input_method".equals(str) ? this.inputMethodManager : super.getSystemService(str);
                    }

/* 18 */            public ImmContext(Context context) {
/* 19 */                this(context, null);
                    }
                }

/* 48 */        public SingleViewPresentation(Context context, Display display, AccessibilityEventsDelegate accessibilityEventsDelegate, PresentationState presentationState, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
/* 49 */            super(new ImmContext(context), display);
/* 50 */            this.startFocused = false;
/* 51 */            this.accessibilityEventsDelegate = accessibilityEventsDelegate;
/* 52 */            this.state = presentationState;
/* 53 */            this.focusChangeListener = onFocusChangeListener;
/* 54 */            this.outerContext = context;
/* 56 */            getWindow().setFlags(8, 8);
/* 57 */            this.startFocused = z;
                }
            }
