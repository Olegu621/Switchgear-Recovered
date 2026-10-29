.class public final synthetic Lf;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lf;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lf;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lf;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/supercell/titan/usercentrics/UsercentricsSDK;

    .line 9
    .line 10
    check-cast p1, Ltz2;

    .line 11
    .line 12
    invoke-static {p0, p1}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->i(Lcom/supercell/titan/usercentrics/UsercentricsSDK;Ltz2;)Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p0, Lorg/json/JSONObject;

    .line 18
    .line 19
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, p0}, Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;->b(Ljava/lang/String;Lorg/json/JSONObject;)Lkotlin/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    check-cast p1, Ljava/lang/Exception;

    .line 29
    .line 30
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_2
    check-cast p0, Lsc1;

    .line 36
    .line 37
    check-cast p1, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Lsc1;->a(I)Lkotlin/text/MatchGroup;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_3
    check-cast p0, Lcom/supercell/titan/agesignals/AgeSignals;

    .line 49
    .line 50
    check-cast p1, Lek3;

    .line 51
    .line 52
    sget v0, Lcom/supercell/titan/agesignals/AgeSignals;->MAX_RETRIES:I

    .line 53
    .line 54
    iget-object v0, p1, Lek3;->a:Ljava/lang/Integer;

    .line 55
    .line 56
    const/4 v1, -0x1

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    move v5, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v5, v1

    .line 66
    :goto_0
    iget-object v0, p1, Lek3;->b:Ljava/lang/Integer;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    move v6, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move v6, v1

    .line 77
    :goto_1
    iget-object v0, p1, Lek3;->c:Ljava/lang/Integer;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    :cond_2
    move v7, v1

    .line 86
    iget-object p1, p1, Lek3;->d:Ljava/util/Date;

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    sget-object v0, Lcom/supercell/titan/agesignals/AgeSignals;->e:Ljava/text/SimpleDateFormat;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    :goto_2
    move-object v8, p1

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    const-string p1, ""

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :goto_3
    new-instance v2, Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v9, 0x1

    .line 108
    const/4 v10, 0x0

    .line 109
    invoke-direct/range {v2 .. v10}, Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;-><init>(ZIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 110
    .line 111
    .line 112
    iput-object v2, p0, Lcom/supercell/titan/agesignals/AgeSignals;->a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_4
    check-cast p0, Lg;

    .line 118
    .line 119
    if-ne p1, p0, :cond_4

    .line 120
    .line 121
    const-string p0, "(this Collection)"

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_4
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
