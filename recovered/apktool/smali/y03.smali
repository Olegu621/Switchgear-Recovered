.class public final Ly03;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La13;

.field public final synthetic c:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(La13;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p3, p0, Ly03;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ly03;->b:La13;

    .line 4
    .line 5
    iput-object p2, p0, Ly03;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ly03;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ly03;->c:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Ly03;->b:La13;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Ltk2;

    .line 16
    .line 17
    iget-object v2, p0, La13;->a:Lfb1;

    .line 18
    .line 19
    iget-object v2, v2, Lfb1;->C:Lhk2;

    .line 20
    .line 21
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lp91;

    .line 26
    .line 27
    iget-object v2, v2, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 36
    .line 37
    invoke-direct {v0, v2, v3, p1}, Ltk2;-><init>(ZLjava/util/List;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1, v0}, La13;->f(Ljava/util/ArrayList;Ltk2;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, Ltk2;

    .line 52
    .line 53
    iget-object v2, p0, La13;->a:Lfb1;

    .line 54
    .line 55
    iget-object v3, v2, Lfb1;->C:Lhk2;

    .line 56
    .line 57
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lp91;

    .line 62
    .line 63
    iget-object v3, v3, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    iget-object v4, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 70
    .line 71
    iget-object v5, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->f:Ljava/util/List;

    .line 72
    .line 73
    invoke-direct {v0, v3, v4, v5}, Ltk2;-><init>(ZLjava/util/List;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1, v0}, La13;->f(Ljava/util/ArrayList;Ltk2;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v0, v2, Lfb1;->X:Lhk2;

    .line 82
    .line 83
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ly3;

    .line 88
    .line 89
    iget-object v2, v0, Ly3;->e:Ljava/lang/String;

    .line 90
    .line 91
    const-string v3, ""

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_0

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_0
    iget-object v0, v0, Ly3;->d:Ljava/util/List;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    new-instance v3, Ls3;

    .line 114
    .line 115
    invoke-direct {v3, v2, v0}, Ls3;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_2
    :goto_0
    new-instance v0, Ls3;

    .line 120
    .line 121
    sget-object v2, Lnd0;->a:Lnd0;

    .line 122
    .line 123
    invoke-direct {v0, v3, v2}, Ls3;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    move-object v3, v0

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    :goto_2
    new-instance v0, Ls3;

    .line 129
    .line 130
    sget-object v2, Lnd0;->a:Lnd0;

    .line 131
    .line 132
    invoke-direct {v0, v3, v2}, Ls3;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :goto_3
    iget-object v0, v3, Ls3;->a:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {p0, p1, v0, v1}, La13;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
