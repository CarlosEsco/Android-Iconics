/*
 * Copyright 2020 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.iconics.typeface.library.fontawesome

import com.mikepenz.iconics.typeface.IIcon
import com.mikepenz.iconics.typeface.ITypeface
import java.util.LinkedList

@Suppress("EnumEntryName")
object FontAwesomeBrand : ITypeface {

    override val fontRes: Int
        get() = R.font.fontawesome_brand_font_v5_13_3

    override val characters: Map<String, Char> by lazy {
        Icon.values().associate { it.name to it.character }
    }

    override val mappingPrefix: String
        get() = "fab"

    override val fontName: String
        get() = "FontAwesome Brand"

    override val version: String
        get() = "5.13.3.0"

    override val iconCount: Int
        get() = characters.size

    override val icons: List<String>
        get() = characters.keys.toCollection(LinkedList())

    override val author: String
        get() = "FontAwesome"

    override val url: String
        get() = "https://fontawesome.com/"

    override val description: String
        get() = "The internet's most popular icon toolkit has been redesigned and built from scratch. On top of this, features like icon font ligatures, an SVG framework, official NPM packages for popular frontend libraries like React, and access to a new CDN."

    override val license: String
        get() = "Font Awesome Free License"

    override val licenseUrl: String
        get() = "https://github.com/FortAwesome/Font-Awesome/blob/master/LICENSE.txt"

    override fun getIcon(key: String): IIcon = Icon.valueOf(key)

    enum class Icon constructor(override val character: Char) : IIcon {
        fab_accessible_icon('\ue901'),
        fab_accusoft('\ue902'),
        fab_acquisitions_incorporated('\ue903'),
        fab_adn('\ue904'),
        fab_adversal('\ue905'),
        fab_affiliatetheme('\ue906'),
        fab_airbnb('\ue907'),
        fab_algolia('\ue908'),
        fab_alipay('\ue909'),
        fab_amazon('\ue90b'),
        fab_amazon_pay('\ue90a'),
        fab_amilia('\ue90c'),
        fab_android('\ue90d'),
        fab_angellist('\ue90e'),
        fab_angrycreative('\ue90f'),
        fab_angular('\ue910'),
        fab_app_store('\ue912'),
        fab_app_store_ios('\ue911'),
        fab_apper('\ue913'),
        fab_apple('\ue915'),
        fab_apple_pay('\ue914'),
        fab_artstation('\ue916'),
        fab_asymmetrik('\ue917'),
        fab_atlassian('\ue918'),
        fab_audible('\ue919'),
        fab_autoprefixer('\ue91a'),
        fab_avianex('\ue91b'),
        fab_aviato('\ue91c'),
        fab_aws('\ue91d'),
        fab_bandcamp('\ue91e'),
        fab_battle_net('\ue91f'),
        fab_behance('\ue921'),
        fab_behance_square('\ue920'),
        fab_bimobject('\ue922'),
        fab_bitbucket('\ue923'),
        fab_bitcoin('\ue924'),
        fab_bity('\ue925'),
        fab_black_tie('\ue926'),
        fab_blackberry('\ue927'),
        fab_blogger('\ue929'),
        fab_blogger_b('\ue928'),
        fab_bluetooth('\ue92b'),
        fab_bluetooth_b('\ue92a'),
        fab_bootstrap('\ue92c'),
        fab_btc('\ue92d'),
        fab_buffer('\ue92e'),
        fab_buromobelexperte('\ue92f'),
        fab_buy_n_large('\ue930'),
        fab_buysellads('\ue931'),
        fab_canadian_maple_leaf('\ue932'),
        fab_cc_amazon_pay('\ue933'),
        fab_cc_amex('\ue934'),
        fab_cc_apple_pay('\ue935'),
        fab_cc_diners_club('\ue936'),
        fab_cc_discover('\ue937'),
        fab_cc_jcb('\ue938'),
        fab_cc_mastercard('\ue939'),
        fab_cc_paypal('\ue93a'),
        fab_cc_stripe('\ue93b'),
        fab_cc_visa('\ue93c'),
        fab_centercode('\ue93d'),
        fab_centos('\ue93e'),
        fab_chrome('\ue93f'),
        fab_chromecast('\ue940'),
        fab_cloudflare('\ue941'),
        fab_cloudscale('\ue942'),
        fab_cloudsmith('\ue943'),
        fab_cloudversify('\ue944'),
        fab_codepen('\ue945'),
        fab_codiepie('\ue946'),
        fab_confluence('\ue947'),
        fab_connectdevelop('\ue948'),
        fab_contao('\ue949'),
        fab_cotton_bureau('\ue94a'),
        fab_cpanel('\ue94b'),
        fab_creative_commons('\ue959'),
        fab_creative_commons_by('\ue94c'),
        fab_creative_commons_nc('\ue94f'),
        fab_creative_commons_nc_eu('\ue94d'),
        fab_creative_commons_nc_jp('\ue94e'),
        fab_creative_commons_nd('\ue950'),
        fab_creative_commons_pd('\ue952'),
        fab_creative_commons_pd_alt('\ue951'),
        fab_creative_commons_remix('\ue953'),
        fab_creative_commons_sa('\ue954'),
        fab_creative_commons_sampling('\ue956'),
        fab_creative_commons_sampling_plus('\ue955'),
        fab_creative_commons_share('\ue957'),
        fab_creative_commons_zero('\ue958'),
        fab_critical_role('\ue95a'),
        fab_css3('\ue95c'),
        fab_css3_alt('\ue95b'),
        fab_cuttlefish('\ue95d'),
        fab_d_and_d('\ue95f'),
        fab_d_and_d_beyond('\ue95e'),
        fab_dailymotion('\ue960'),
        fab_dashcube('\ue961'),
        fab_deezer('\ue962'),
        fab_delicious('\ue963'),
        fab_deploydog('\ue964'),
        fab_deskpro('\ue965'),
        fab_dev('\ue966'),
        fab_deviantart('\ue967'),
        fab_dhl('\ue968'),
        fab_diaspora('\ue969'),
        fab_digg('\ue96a'),
        fab_digital_ocean('\ue96b'),
        fab_discord('\ue96c'),
        fab_discourse('\ue96d'),
        fab_dochub('\ue96e'),
        fab_docker('\ue96f'),
        fab_draft2digital('\ue970'),
        fab_dribbble('\ue972'),
        fab_dribbble_square('\ue971'),
        fab_dropbox('\ue973'),
        fab_drupal('\ue974'),
        fab_dyalog('\ue975'),
        fab_earlybirds('\ue976'),
        fab_ebay('\ue977'),
        fab_edge('\ue979'),
        fab_edge_legacy('\ue978'),
        fab_elementor('\ue97a'),
        fab_ello('\ue97b'),
        fab_ember('\ue97c'),
        fab_empire('\ue97d'),
        fab_envira('\ue97e'),
        fab_erlang('\ue97f'),
        fab_ethereum('\ue980'),
        fab_etsy('\ue981'),
        fab_evernote('\ue982'),
        fab_expeditedssl('\ue983'),
        fab_facebook('\ue987'),
        fab_facebook_f('\ue984'),
        fab_facebook_messenger('\ue985'),
        fab_facebook_square('\ue986'),
        fab_fantasy_flight_games('\ue988'),
        fab_fedex('\ue989'),
        fab_fedora('\ue98a'),
        fab_figma('\ue98b'),
        fab_firefox('\ue98d'),
        fab_firefox_browser('\ue98c'),
        fab_first_order('\ue98f'),
        fab_first_order_alt('\ue98e'),
        fab_firstdraft('\ue990'),
        fab_flickr('\ue991'),
        fab_flipboard('\ue992'),
        fab_fly('\ue993'),
        fab_font_awesome('\ue997'),
        fab_font_awesome_alt('\ue994'),
        fab_font_awesome_flag('\ue995'),
        fab_font_awesome_logo_full('\ue996'),
        fab_fonticons('\ue999'),
        fab_fonticons_fi('\ue998'),
        fab_fort_awesome('\ue99b'),
        fab_fort_awesome_alt('\ue99a'),
        fab_forumbee('\ue99c'),
        fab_foursquare('\ue99d'),
        fab_free_code_camp('\ue99e'),
        fab_freebsd('\ue99f'),
        fab_fulcrum('\ue9a0'),
        fab_galactic_republic('\ue9a1'),
        fab_galactic_senate('\ue9a2'),
        fab_get_pocket('\ue9a3'),
        fab_gg('\ue9a5'),
        fab_gg_circle('\ue9a4'),
        fab_git('\ue9a8'),
        fab_git_alt('\ue9a6'),
        fab_git_square('\ue9a7'),
        fab_github('\ue9ab'),
        fab_github_alt('\ue9a9'),
        fab_github_square('\ue9aa'),
        fab_gitkraken('\ue9ac'),
        fab_gitlab('\ue9ad'),
        fab_gitter('\ue9ae'),
        fab_glide('\ue9b0'),
        fab_glide_g('\ue9af'),
        fab_gofore('\ue9b1'),
        fab_goodreads('\ue9b3'),
        fab_goodreads_g('\ue9b2'),
        fab_google('\ue9bb'),
        fab_google_drive('\ue9b4'),
        fab_google_pay('\ue9b5'),
        fab_google_play('\ue9b6'),
        fab_google_plus('\ue9b9'),
        fab_google_plus_g('\ue9b7'),
        fab_google_plus_square('\ue9b8'),
        fab_google_wallet('\ue9ba'),
        fab_gratipay('\ue9bc'),
        fab_grav('\ue9bd'),
        fab_gripfire('\ue9be'),
        fab_grunt('\ue9bf'),
        fab_guilded('\ue9c0'),
        fab_gulp('\ue9c1'),
        fab_hacker_news('\ue9c3'),
        fab_hacker_news_square('\ue9c2'),
        fab_hackerrank('\ue9c4'),
        fab_hips('\ue9c5'),
        fab_hire_a_helper('\ue9c6'),
        fab_hive('\ue9c7'),
        fab_hooli('\ue9c8'),
        fab_hornbill('\ue9c9'),
        fab_hotjar('\ue9ca'),
        fab_houzz('\ue9cb'),
        fab_html5('\ue9cc'),
        fab_hubspot('\ue9cd'),
        fab_ideal('\ue9ce'),
        fab_imdb('\ue9cf'),
        fab_innosoft('\ue9d0'),
        fab_instagram('\ue9d2'),
        fab_instagram_square('\ue9d1'),
        fab_instalod('\ue9d3'),
        fab_intercom('\ue9d4'),
        fab_internet_explorer('\ue9d5'),
        fab_invision('\ue9d6'),
        fab_ioxhost('\ue9d7'),
        fab_itch_io('\ue9d8'),
        fab_itunes('\ue9da'),
        fab_itunes_note('\ue9d9'),
        fab_java('\ue9db'),
        fab_jedi_order('\ue9dc'),
        fab_jenkins('\ue9dd'),
        fab_jira('\ue9de'),
        fab_joget('\ue9df'),
        fab_joomla('\ue9e0'),
        fab_js('\ue9e2'),
        fab_js_square('\ue9e1'),
        fab_jsfiddle('\ue9e3'),
        fab_kaggle('\ue9e4'),
        fab_keybase('\ue9e5'),
        fab_keycdn('\ue9e6'),
        fab_kickstarter('\ue9e8'),
        fab_kickstarter_k('\ue9e7'),
        fab_korvue('\ue9e9'),
        fab_laravel('\ue9ea'),
        fab_lastfm('\ue9ec'),
        fab_lastfm_square('\ue9eb'),
        fab_leanpub('\ue9ed'),
        fab_less('\ue9ee'),
        fab_line('\ue9ef'),
        fab_linkedin('\ue9f1'),
        fab_linkedin_in('\ue9f0'),
        fab_linode('\ue9f2'),
        fab_linux('\ue9f3'),
        fab_lyft('\ue9f4'),
        fab_magento('\ue9f5'),
        fab_mailchimp('\ue9f6'),
        fab_mandalorian('\ue9f7'),
        fab_markdown('\ue9f8'),
        fab_mastodon('\ue9f9'),
        fab_maxcdn('\ue9fa'),
        fab_mdb('\ue9fb'),
        fab_medapps('\ue9fc'),
        fab_medium('\ue9fe'),
        fab_medium_m('\ue9fd'),
        fab_medrt('\ue9ff'),
        fab_meetup('\uea00'),
        fab_megaport('\uea01'),
        fab_mendeley('\uea02'),
        fab_microblog('\uea03'),
        fab_microsoft('\uea04'),
        fab_mix('\uea05'),
        fab_mixcloud('\uea06'),
        fab_mixer('\uea07'),
        fab_mizuni('\uea08'),
        fab_modx('\uea09'),
        fab_monero('\uea0a'),
        fab_napster('\uea0b'),
        fab_neos('\uea0c'),
        fab_nimblr('\uea0d'),
        fab_node('\uea0f'),
        fab_node_js('\uea0e'),
        fab_npm('\uea10'),
        fab_ns8('\uea11'),
        fab_nutritionix('\uea12'),
        fab_octopus_deploy('\uea13'),
        fab_odnoklassniki('\uea15'),
        fab_odnoklassniki_square('\uea14'),
        fab_old_republic('\uea16'),
        fab_opencart('\uea17'),
        fab_openid('\uea18'),
        fab_opera('\uea19'),
        fab_optin_monster('\uea1a'),
        fab_orcid('\uea1b'),
        fab_osi('\uea1c'),
        fab_page4('\uea1d'),
        fab_pagelines('\uea1e'),
        fab_palfed('\uea1f'),
        fab_patreon('\uea20'),
        fab_paypal('\uea21'),
        fab_penny_arcade('\uea22'),
        fab_perbyte('\uea23'),
        fab_periscope('\uea24'),
        fab_phabricator('\uea25'),
        fab_phoenix_framework('\uea26'),
        fab_phoenix_squadron('\uea27'),
        fab_php('\uea28'),
        fab_pied_piper('\uea2d'),
        fab_pied_piper_alt('\uea29'),
        fab_pied_piper_hat('\uea2a'),
        fab_pied_piper_pp('\uea2b'),
        fab_pied_piper_square('\uea2c'),
        fab_pinterest('\uea30'),
        fab_pinterest_p('\uea2e'),
        fab_pinterest_square('\uea2f'),
        fab_playstation('\uea31'),
        fab_product_hunt('\uea32'),
        fab_pushed('\uea33'),
        fab_px('\ue900'),
        fab_python('\uea34'),
        fab_qq('\uea35'),
        fab_quinscape('\uea36'),
        fab_quora('\uea37'),
        fab_r_project('\uea38'),
        fab_raspberry_pi('\uea39'),
        fab_ravelry('\uea3a'),
        fab_react('\uea3b'),
        fab_reacteurope('\uea3c'),
        fab_readme('\uea3d'),
        fab_rebel('\uea3e'),
        fab_red_river('\uea3f'),
        fab_reddit('\uea42'),
        fab_reddit_alien('\uea40'),
        fab_reddit_square('\uea41'),
        fab_redhat('\uea43'),
        fab_renren('\uea44'),
        fab_replyd('\uea45'),
        fab_researchgate('\uea46'),
        fab_resolving('\uea47'),
        fab_rev('\uea48'),
        fab_rocketchat('\uea49'),
        fab_rockrms('\uea4a'),
        fab_rust('\uea4b'),
        fab_safari('\uea4c'),
        fab_salesforce('\uea4d'),
        fab_sass('\uea4e'),
        fab_schlix('\uea4f'),
        fab_scribd('\uea50'),
        fab_searchengin('\uea51'),
        fab_sellcast('\uea52'),
        fab_sellsy('\uea53'),
        fab_servicestack('\uea54'),
        fab_shirtsinbulk('\uea55'),
        fab_shopify('\uea56'),
        fab_shopware('\uea57'),
        fab_simplybuilt('\uea58'),
        fab_sistrix('\uea59'),
        fab_sith('\uea5a'),
        fab_sketch('\uea5b'),
        fab_skyatlas('\uea5c'),
        fab_skype('\uea5d'),
        fab_slack('\uea5f'),
        fab_slack_hash('\uea5e'),
        fab_slideshare('\uea60'),
        fab_snapchat('\uea63'),
        fab_snapchat_ghost('\uea61'),
        fab_snapchat_square('\uea62'),
        fab_soundcloud('\uea64'),
        fab_sourcetree('\uea65'),
        fab_speakap('\uea66'),
        fab_speaker_deck('\uea67'),
        fab_spotify('\uea68'),
        fab_squarespace('\uea69'),
        fab_stack_exchange('\uea6a'),
        fab_stack_overflow('\uea6b'),
        fab_stackpath('\uea6c'),
        fab_staylinked('\uea6d'),
        fab_steam('\uea70'),
        fab_steam_square('\uea6e'),
        fab_steam_symbol('\uea6f'),
        fab_sticker_mule('\uea71'),
        fab_strava('\uea72'),
        fab_stripe('\uea74'),
        fab_stripe_s('\uea73'),
        fab_studiovinari('\uea75'),
        fab_stumbleupon('\uea77'),
        fab_stumbleupon_circle('\uea76'),
        fab_superpowers('\uea78'),
        fab_supple('\uea79'),
        fab_suse('\uea7a'),
        fab_swift('\uea7b'),
        fab_symfony('\uea7c'),
        fab_teamspeak('\uea7d'),
        fab_telegram('\uea7f'),
        fab_telegram_plane('\uea7e'),
        fab_tencent_weibo('\uea80'),
        fab_the_red_yeti('\uea81'),
        fab_themeco('\uea82'),
        fab_themeisle('\uea83'),
        fab_think_peaks('\uea84'),
        fab_tiktok('\uea85'),
        fab_trade_federation('\uea86'),
        fab_trello('\uea87'),
        fab_tripadvisor('\uea88'),
        fab_tumblr('\uea8a'),
        fab_tumblr_square('\uea89'),
        fab_twitch('\uea8b'),
        fab_twitter('\uea8d'),
        fab_twitter_square('\uea8c'),
        fab_typo3('\uea8e'),
        fab_uber('\uea8f'),
        fab_ubuntu('\uea90'),
        fab_uikit('\uea91'),
        fab_umbraco('\uea92'),
        fab_uncharted('\uea93'),
        fab_uniregistry('\uea94'),
        fab_unity('\uea95'),
        fab_unsplash('\uea96'),
        fab_untappd('\uea97'),
        fab_ups('\uea98'),
        fab_usb('\uea99'),
        fab_usps('\uea9a'),
        fab_ussunnah('\uea9b'),
        fab_vaadin('\uea9c'),
        fab_viacoin('\uea9d'),
        fab_viadeo('\uea9f'),
        fab_viadeo_square('\uea9e'),
        fab_viber('\ueaa0'),
        fab_vimeo('\ueaa3'),
        fab_vimeo_square('\ueaa1'),
        fab_vimeo_v('\ueaa2'),
        fab_vine('\ueaa4'),
        fab_vk('\ueaa5'),
        fab_vnv('\ueaa6'),
        fab_vuejs('\ueaa7'),
        fab_watchman_monitoring('\ueaa8'),
        fab_waze('\ueaa9'),
        fab_weebly('\ueaaa'),
        fab_weibo('\ueaab'),
        fab_weixin('\ueaac'),
        fab_whatsapp('\ueaae'),
        fab_whatsapp_square('\ueaad'),
        fab_whmcs('\ueaaf'),
        fab_wikipedia_w('\ueab0'),
        fab_windows('\ueab1'),
        fab_wix('\ueab2'),
        fab_wizards_of_the_coast('\ueab3'),
        fab_wodu('\ueab4'),
        fab_wolf_pack_battalion('\ueab5'),
        fab_wordpress('\ueab7'),
        fab_wordpress_simple('\ueab6'),
        fab_wpbeginner('\ueab8'),
        fab_wpexplorer('\ueab9'),
        fab_wpforms('\ueaba'),
        fab_wpressr('\ueabb'),
        fab_xbox('\ueabc'),
        fab_xing('\ueabe'),
        fab_xing_square('\ueabd'),
        fab_y_combinator('\ueabf'),
        fab_yahoo('\ueac0'),
        fab_yammer('\ueac1'),
        fab_yandex('\ueac3'),
        fab_yandex_international('\ueac2'),
        fab_yarn('\ueac4'),
        fab_yelp('\ueac5'),
        fab_yoast('\ueac6'),
        fab_youtube('\ueac8'),
        fab_youtube_square('\ueac7'),
        fab_zhihu('\ueac9');

        override val typeface: ITypeface by lazy { FontAwesomeBrand }
    }
}