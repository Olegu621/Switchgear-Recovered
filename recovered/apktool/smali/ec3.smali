.class public final Lec3;
.super Lfb3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Landroid/app/AlertDialog;

.field public final synthetic b:Lcp0;


# direct methods
.method public constructor <init>(Lcp0;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lec3;->b:Lcp0;

    .line 2
    .line 3
    iput-object p2, p0, Lec3;->a:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-direct {p0}, Lfb3;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lec3;->b:Lcp0;

    .line 2
    .line 3
    iget-object v0, v0, Lcp0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lya3;

    .line 6
    .line 7
    iget-object v1, v0, Lya3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lya3;->f:Lur0;

    .line 14
    .line 15
    iget-object v0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lec3;->a:Landroid/app/AlertDialog;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
