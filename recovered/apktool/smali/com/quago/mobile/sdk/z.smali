.class public Lcom/quago/mobile/sdk/z;
.super Lcom/quago/mobile/sdk/e1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>(Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/quago/mobile/sdk/e1;-><init>(Landroid/view/Window$Callback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/quago/mobile/sdk/i;->a(Landroid/view/KeyEvent;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/e1;->a:Landroid/view/Window$Callback;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/Quago;->quagoManager:Lcom/quago/mobile/sdk/o0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, v0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lcom/quago/mobile/sdk/i;->a(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, Lcom/quago/mobile/sdk/o0;->c:J

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iput-wide v1, v0, Lcom/quago/mobile/sdk/o0;->c:J

    .line 29
    .line 30
    iget-wide v3, v0, Lcom/quago/mobile/sdk/o0;->B:J

    .line 31
    .line 32
    sub-long/2addr v1, v3

    .line 33
    iget-wide v3, v0, Lcom/quago/mobile/sdk/o0;->C:J

    .line 34
    .line 35
    add-long/2addr v3, v1

    .line 36
    iput-wide v3, v0, Lcom/quago/mobile/sdk/o0;->b:J

    .line 37
    .line 38
    :cond_2
    :goto_0
    iget-object p0, p0, Lcom/quago/mobile/sdk/e1;->a:Landroid/view/Window$Callback;

    .line 39
    .line 40
    if-nez p0, :cond_3

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_3
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0
.end method
