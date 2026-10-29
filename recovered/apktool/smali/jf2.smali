.class public abstract Ljf2;
.super Lor0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zza:Le9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le9;"
        }
    .end annotation
.end field

.field private static final zzb:Lw8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw8;"
        }
    .end annotation
.end field

.field private static final zzc:Lh9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh9;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljf2;->zza:Le9;

    .line 7
    .line 8
    new-instance v1, Lva3;

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-direct {v1, v2}, Lva3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Ljf2;->zzb:Lw8;

    .line 15
    .line 16
    new-instance v2, Lh9;

    .line 17
    .line 18
    const-string v3, "SmsRetriever.API"

    .line 19
    .line 20
    invoke-direct {v2, v3, v1, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Ljf2;->zzc:Lh9;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6

    .line 1
    sget-object v3, Ljf2;->zzc:Lh9;

    .line 2
    .line 3
    sget-object v4, Lb9;->g:La9;

    .line 4
    .line 5
    sget-object v5, Lnr0;->c:Lnr0;

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    sget-object v3, Ljf2;->zzc:Lh9;

    .line 14
    sget-object v5, Lnr0;->c:Lnr0;

    const/4 v2, 0x0

    .line 15
    sget-object v4, Lb9;->g:La9;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    return-void
.end method
