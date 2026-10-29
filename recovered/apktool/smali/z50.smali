.class public final synthetic Lz50;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfy;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf02;


# direct methods
.method public synthetic constructor <init>(Lf02;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz50;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz50;->b:Lf02;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Lcy;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lz50;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lz50;->b:Lf02;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lb5;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(Lf02;Lb5;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance v0, Lb60;

    .line 16
    .line 17
    check-cast p1, Lb5;

    .line 18
    .line 19
    const-class v1, Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lb5;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/content/Context;

    .line 26
    .line 27
    const-class v2, Lvi0;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Lb5;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lvi0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lvi0;->d()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-class v3, Lxt0;

    .line 40
    .line 41
    invoke-static {v3}, Lf02;->a(Ljava/lang/Class;)Lf02;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p1, v3}, Lb5;->a(Lf02;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const-class v4, La70;

    .line 50
    .line 51
    invoke-virtual {p1, v4}, Lb5;->b(Ljava/lang/Class;)Liz1;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {p1, p0}, Lb5;->e(Lf02;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    move-object v5, p0

    .line 60
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    invoke-direct/range {v0 .. v5}, Lb60;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Liz1;Ljava/util/concurrent/Executor;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
