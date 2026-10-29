.class public final Ldm;
.super Lsq3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lcm;

.field public static final w:Lej0;


# instance fields
.field public final b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

.field public final c:Lur3;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final i:Z

.field public final v:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcm;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldm;->Companion:Lcm;

    .line 7
    .line 8
    sget-object v0, Lej0;->a:Lej0;

    .line 9
    .line 10
    sput-object v0, Ldm;->w:Lej0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lsq3;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldm;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 20
    .line 21
    iput-object p2, p0, Ldm;->c:Lur3;

    .line 22
    .line 23
    iput-object p3, p0, Ldm;->d:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Ldm;->e:Ljava/util/List;

    .line 26
    .line 27
    iput-object p5, p0, Ldm;->f:Ljava/util/List;

    .line 28
    .line 29
    iput-boolean p6, p0, Ldm;->i:Z

    .line 30
    .line 31
    iput-object p7, p0, Ldm;->v:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 32
    .line 33
    return-void
.end method
