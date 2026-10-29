.class public abstract Lna2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lcb;

.field public static final b:Lcb;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lb7;->Y:Lb7;

    .line 2
    .line 3
    sget-boolean v1, Lmm;->a:Z

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    const/16 v3, 0x17

    .line 8
    .line 9
    new-instance v4, Lcb;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-direct {v4, v0, v3}, Lcb;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-direct {v4, v0, v2}, Lcb;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 18
    .line 19
    .line 20
    :goto_0
    sput-object v4, Lna2;->a:Lcb;

    .line 21
    .line 22
    sget-object v0, Lb7;->Z:Lb7;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    new-instance v2, Lcb;

    .line 27
    .line 28
    invoke-direct {v2, v0, v3}, Lcb;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    new-instance v3, Lcb;

    .line 33
    .line 34
    invoke-direct {v3, v0, v2}, Lcb;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 35
    .line 36
    .line 37
    :goto_1
    sget-object v0, Lma2;->b:Lma2;

    .line 38
    .line 39
    const/16 v2, 0x1b

    .line 40
    .line 41
    const/16 v3, 0x18

    .line 42
    .line 43
    new-instance v4, Lcb;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-direct {v4, v0, v3}, Lcb;-><init>(Lkotlin/jvm/functions/Function2;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-direct {v4, v0, v2}, Lcb;-><init>(Lkotlin/jvm/functions/Function2;I)V

    .line 52
    .line 53
    .line 54
    :goto_2
    sput-object v4, Lna2;->b:Lcb;

    .line 55
    .line 56
    sget-object v0, Lma2;->c:Lma2;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    new-instance v1, Lcb;

    .line 61
    .line 62
    invoke-direct {v1, v0, v3}, Lcb;-><init>(Lkotlin/jvm/functions/Function2;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    new-instance v1, Lcb;

    .line 67
    .line 68
    invoke-direct {v1, v0, v2}, Lcb;-><init>(Lkotlin/jvm/functions/Function2;I)V

    .line 69
    .line 70
    .line 71
    :goto_3
    return-void
.end method
