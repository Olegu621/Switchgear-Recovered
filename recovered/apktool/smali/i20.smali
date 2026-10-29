.class public final synthetic Li20;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj20;


# direct methods
.method public synthetic constructor <init>(Lj20;I)V
    .locals 0

    .line 1
    iput p2, p0, Li20;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Li20;->b:Lj20;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li20;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Li20;->b:Lj20;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lj20;->a:Ljava/util/Map;

    .line 10
    .line 11
    const-string v0, "emitterConfig"

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    new-instance v1, Llc0;

    .line 20
    .line 21
    check-cast p0, Ljava/util/Map;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Llc0;-><init>(Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object v1

    .line 27
    :pswitch_0
    iget-object p0, p0, Lj20;->a:Ljava/util/Map;

    .line 28
    .line 29
    const-string v0, "gdprConfig"

    .line 30
    .line 31
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    new-instance v1, Ljq0;

    .line 38
    .line 39
    check-cast p0, Ljava/util/Map;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Ljq0;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v1

    .line 45
    :pswitch_1
    iget-object p0, p0, Lj20;->a:Ljava/util/Map;

    .line 46
    .line 47
    const-string v0, "subjectConfig"

    .line 48
    .line 49
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    new-instance v1, Lki2;

    .line 56
    .line 57
    check-cast p0, Ljava/util/Map;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Lki2;-><init>(Ljava/util/Map;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object v1

    .line 63
    :pswitch_2
    iget-object p0, p0, Lj20;->a:Ljava/util/Map;

    .line 64
    .line 65
    const-string v0, "trackerConfig"

    .line 66
    .line 67
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    new-instance v1, Lwq2;

    .line 74
    .line 75
    check-cast p0, Ljava/util/Map;

    .line 76
    .line 77
    invoke-direct {v1, p0}, Lwq2;-><init>(Ljava/util/Map;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-object v1

    .line 81
    :pswitch_3
    new-instance v0, Ltm1;

    .line 82
    .line 83
    iget-object p0, p0, Lj20;->a:Ljava/util/Map;

    .line 84
    .line 85
    const-string v1, "networkConfig"

    .line 86
    .line 87
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    check-cast p0, Ljava/util/Map;

    .line 95
    .line 96
    invoke-direct {v0, p0}, Ltm1;-><init>(Ljava/util/Map;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
