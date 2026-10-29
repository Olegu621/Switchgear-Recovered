.class public final Lcom/usercentrics/ccpa/a;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lzr;


# instance fields
.field public final a:Lqc3;

.field public final b:Lo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzr;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/ccpa/a;->Companion:Lzr;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lqc3;Lo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/usercentrics/ccpa/a;->a:Lqc3;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/usercentrics/ccpa/a;->b:Lo;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcom/usercentrics/ccpa/CCPAData;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/usercentrics/ccpa/CCPAData;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lem;->a:Lkotlin/text/Regex;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->b(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/usercentrics/ccpa/a;->a:Lqc3;

    .line 14
    .line 15
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lod2;

    .line 18
    .line 19
    const-string v0, "IABUSPrivacy_String"

    .line 20
    .line 21
    invoke-virtual {p0, v0, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object p0, Lyl;->Companion:Lxl;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance p0, Lyl;

    .line 31
    .line 32
    const-string v0, "Invalid CCPA String: "

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method
