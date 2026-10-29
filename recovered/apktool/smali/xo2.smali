.class public final synthetic Lxo2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/16 p0, 0x42

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-ne p2, p0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputOkPressed()V

    .line 7
    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const/16 p0, 0x6f

    .line 11
    .line 12
    if-ne p2, p0, :cond_1

    .line 13
    .line 14
    invoke-static {}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputEscPressed()V

    .line 15
    .line 16
    .line 17
    return p1

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method
