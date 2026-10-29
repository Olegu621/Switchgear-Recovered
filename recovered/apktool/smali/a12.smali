.class public final La12;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Ld12;

.field public final synthetic c:Ljava/lang/Double;

.field public final synthetic d:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final synthetic e:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ld12;Ljava/lang/Double;Lcom/google/android/recaptcha/RecaptchaAction;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, La12;->b:Ld12;

    .line 2
    .line 3
    iput-object p2, p0, La12;->c:Ljava/lang/Double;

    .line 4
    .line 5
    iput-object p3, p0, La12;->d:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 6
    .line 7
    iput-object p4, p0, La12;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 6

    .line 1
    new-instance v0, La12;

    .line 2
    .line 3
    iget-object v3, p0, La12;->d:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 4
    .line 5
    iget-object v4, p0, La12;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    iget-object v1, p0, La12;->b:Ld12;

    .line 8
    .line 9
    iget-object v2, p0, La12;->c:Ljava/lang/Double;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La12;-><init>(Ld12;Ljava/lang/Double;Lcom/google/android/recaptcha/RecaptchaAction;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La12;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La12;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La12;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, La12;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    :goto_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Lo42;

    .line 25
    .line 26
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, La12;->b:Ld12;

    .line 33
    .line 34
    iget-object p1, p1, Ld12;->b:Lcom/google/android/recaptcha/RecaptchaClient;

    .line 35
    .line 36
    if-eqz p1, :cond_7

    .line 37
    .line 38
    iget-object v1, p0, La12;->c:Ljava/lang/Double;

    .line 39
    .line 40
    iget-object v5, p0, La12;->d:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    double-to-long v6, v6

    .line 49
    iput v4, p0, La12;->a:I

    .line 50
    .line 51
    invoke-interface {p1, v5, v6, v7, p0}, Lcom/google/android/recaptcha/RecaptchaClient;->execute-0E7RQCE(Lcom/google/android/recaptcha/RecaptchaAction;JLc10;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iput v3, p0, La12;->a:I

    .line 59
    .line 60
    invoke-interface {p1, v5, p0}, Lcom/google/android/recaptcha/RecaptchaClient;->execute-gIAlu-s(Lcom/google/android/recaptcha/RecaptchaAction;Lc10;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_4

    .line 65
    .line 66
    :goto_1
    return-object v0

    .line 67
    :cond_4
    :goto_2
    sget-object v0, Lo42;->b:Lm42;

    .line 68
    .line 69
    instance-of v0, p1, Ln42;

    .line 70
    .line 71
    iget-object p0, p0, La12;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    invoke-interface {p0, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    const-string v0, "FL_EXECUTE_FAILED"

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p0, v0, p1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_7
    const-string p0, "recaptchaClient"

    .line 100
    .line 101
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v2
.end method
