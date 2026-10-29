.class public final Lv53;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lv53;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lv53;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    sget-object v0, Lcom/supercell/titan/VirtualKeyboardHandler;->c:Lcom/supercell/titan/KeyboardDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/supercell/titan/KeyboardDialog;->a:Lcom/supercell/titan/GameApp;

    .line 8
    .line 9
    const-string v3, "input_method"

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-virtual {v3, v4, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, p0, Lv53;->a:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-boolean p0, p0, Lv53;->b:Z

    .line 39
    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    invoke-static {}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputKeyboardDismissed()V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v2}, Lcom/supercell/titan/GameApp;->setSystemUiVisibility()V

    .line 46
    .line 47
    .line 48
    const-wide/16 v3, 0x7d0

    .line 49
    .line 50
    invoke-virtual {v2, v3, v4}, Lcom/supercell/titan/GameApp;->setSystemUiVisibilityDelayed(J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 54
    .line 55
    .line 56
    :goto_0
    const/4 p0, 0x0

    .line 57
    sput-object p0, Lcom/supercell/titan/VirtualKeyboardHandler;->c:Lcom/supercell/titan/KeyboardDialog;

    .line 58
    .line 59
    :cond_3
    return-void
.end method
