.class public final Ldt0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb5;


# direct methods
.method public synthetic constructor <init>(Lb5;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldt0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldt0;->b:Lb5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ldt0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ldt0;->b:Lb5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "Helpshift Debugger"

    .line 9
    .line 10
    const-class v1, Lcom/helpshift/activities/HSDebugActivity;

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lb5;->f(Lb5;Ljava/lang/String;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Lb5;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lxs0;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lxs0;->i()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
