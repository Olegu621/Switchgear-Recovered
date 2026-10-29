.class public final Loy0;
.super Lb92;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;JJ)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlin/Pair;

    .line 5
    .line 6
    const-string v1, "installReferrer"

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    cmp-long p2, p3, v1

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const-wide/16 v4, 0x3e8

    .line 17
    .line 18
    if-lez p2, :cond_0

    .line 19
    .line 20
    mul-long/2addr p3, v4

    .line 21
    sget p2, Lmn0;->p:I

    .line 22
    .line 23
    new-instance p2, Ljava/util/Date;

    .line 24
    .line 25
    invoke-direct {p2, p3, p4}, Ljava/util/Date;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Lmn0;->o(Ljava/util/Date;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object p2, v3

    .line 34
    :goto_0
    new-instance p3, Lkotlin/Pair;

    .line 35
    .line 36
    const-string p4, "referrerClickTimestamp"

    .line 37
    .line 38
    invoke-direct {p3, p4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    cmp-long p2, p5, v1

    .line 42
    .line 43
    if-lez p2, :cond_1

    .line 44
    .line 45
    mul-long/2addr p5, v4

    .line 46
    sget p2, Lmn0;->p:I

    .line 47
    .line 48
    new-instance p2, Ljava/util/Date;

    .line 49
    .line 50
    invoke-direct {p2, p5, p6}, Ljava/util/Date;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lmn0;->o(Ljava/util/Date;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :cond_1
    new-instance p2, Lkotlin/Pair;

    .line 58
    .line 59
    const-string p4, "installBeginTimestamp"

    .line 60
    .line 61
    invoke-direct {p2, p4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance p4, Lkotlin/Pair;

    .line 69
    .line 70
    const-string p5, "googlePlayInstantParam"

    .line 71
    .line 72
    invoke-direct {p4, p5, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    filled-new-array {v0, p3, p2, p4}, [Lkotlin/Pair;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string p2, "iglu:com.android.installreferrer.api/referrer_details/jsonschema/1-0-0"

    .line 84
    .line 85
    invoke-direct {p0, p2, p1}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method
