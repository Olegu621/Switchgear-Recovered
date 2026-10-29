.class public abstract Lqu1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static a:Ld13;

.field public static b:Loz2;

.field public static c:Lfs0;

.field public static d:Lau1;

.field public static e:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld13;

    .line 2
    .line 3
    sget-object v1, Ll03;->a:Ll03;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ld13;-><init>(Ll03;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqu1;->a:Ld13;

    .line 9
    .line 10
    sget-object v0, Lyh;->d0:Lyh;

    .line 11
    .line 12
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lqu1;->e:Lhk2;

    .line 17
    .line 18
    return-void
.end method

.method public static a()Lau1;
    .locals 10

    .line 1
    sget-object v0, Lqu1;->d:Lau1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lau1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    invoke-direct/range {v1 .. v9}, Lau1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    return-object v0
.end method
