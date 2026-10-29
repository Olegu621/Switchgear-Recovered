.class public final Lpv2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqv2;


# direct methods
.method public synthetic constructor <init>(Lqv2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpv2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpv2;->b:Lqv2;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lpv2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lpv2;->b:Lqv2;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lqv2;->c:Lyv2;

    .line 10
    .line 11
    iget-object v0, v0, Lyv2;->i:Lyz2;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lqv2;->a:Lqi1;

    .line 16
    .line 17
    iget-object p0, p0, Lqi1;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    xor-int/2addr v0, v1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    new-instance v0, Lxz2;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lxz2;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    :cond_1
    :goto_0
    return-object v0

    .line 38
    :pswitch_0
    iget-object v0, p0, Lqv2;->b:Lo61;

    .line 39
    .line 40
    sget-object v2, Lo61;->a:Lo61;

    .line 41
    .line 42
    if-eq v0, v2, :cond_3

    .line 43
    .line 44
    sget-object v2, Lo61;->d:Lo61;

    .line 45
    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v1, 0x0

    .line 50
    :cond_3
    :goto_1
    iget-object p0, p0, Lqv2;->a:Lqi1;

    .line 51
    .line 52
    iget-object p0, p0, Lqi1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Ljava/util/List;

    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    move-object v3, v2

    .line 76
    check-cast v3, Lev1;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    iget-object v3, v3, Lev1;->c:Lfv1;

    .line 81
    .line 82
    sget-object v4, Lfv1;->b:Lfv1;

    .line 83
    .line 84
    if-ne v3, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    invoke-static {v0}, Lyy1;->p(Ljava/util/List;)Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/util/List;

    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
