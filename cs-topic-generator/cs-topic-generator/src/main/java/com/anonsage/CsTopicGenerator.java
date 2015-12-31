/**
 * Created by Danial Goodwin on 2015-12-30.
 */
package com.anonsage;

import java.util.ArrayList;
import java.util.Random;

/** New ideas are tough. This makes it easy and automatic. */
public class CsTopicGenerator {

    private ArrayList<String> adverbs = new ArrayList<>();
    private ArrayList<String> adjectives = new ArrayList<>();
    private ArrayList<String> nouns = new ArrayList<>();

    private ArrayList<String> phraseConnectives = new ArrayList<>();

    private Random mRandom = new Random();

    public CsTopicGenerator() {
        loadData();
    }

    private void loadData() {
        adverbs.add("integrated");
        adverbs.add("parallel");
        adverbs.add("virtual");
        adverbs.add("interactive");
        adverbs.add("responsive");
        adverbs.add("synchronized");
        adverbs.add("balanced");
        adverbs.add("virtual");
        adverbs.add("meta-level");
        adverbs.add("optimized");
        adverbs.add("active");
        adverbs.add("parameterized");
        adverbs.add("conceptual");
        adverbs.add("scalable");
        adverbs.add("dynamic");
        adverbs.add("high-level");
        adverbs.add("collaborative");
        adverbs.add("type-safe");
        adverbs.add("reliable");
        adverbs.add("open");
        adverbs.add("coordinated");

        adjectives.add("mobility");
        adjectives.add("functional");
        adjectives.add("programmable");
        adjectives.add("distributed");
        adjectives.add("logical");
        adjectives.add("digital");
        adjectives.add("concurrent");
        adjectives.add("knowledge-based");
        adjectives.add("multimedia");
        adjectives.add("binary");
        adjectives.add("object-oriented");
        adjectives.add("secure");
        adjectives.add("high-speed");
        adjectives.add("real-time");
        adjectives.add("parallelizing");
        adjectives.add("watermarking");
        adjectives.add("proxy");
        adjectives.add("cloud-based");
        adjectives.add("big-data");
        adjectives.add("bioinformatic");

        nouns.add("network");
        nouns.add("preprocessor");
        nouns.add("compiler");
        nouns.add("system");
        nouns.add("interface");
        nouns.add("protocol");
        nouns.add("architecture");
        nouns.add("database");
        nouns.add("algorithm");
        nouns.add("toolkit");
        nouns.add("display");
        nouns.add("technology");
        nouns.add("solution");
        nouns.add("language");
        nouns.add("agent");
        nouns.add("theorem prover");
        nouns.add("work cluster");
        nouns.add("cache");
        nouns.add("network");
        nouns.add("data center");
        nouns.add("hypervisor");

        phraseConnectives.add("for");
        phraseConnectives.add("related to");
        phraseConnectives.add("derived from");
        phraseConnectives.add("applied to");
        phraseConnectives.add("embedded in");
    }

    public String getTopic() {
        StringBuilder sb = new StringBuilder();
        appendAdverbAdjectiveNoun(sb);
        sb.append(" ").append(getPhraseConnective()).append(" ");
        appendAdverbAdjectiveNoun(sb);
        return sb.toString();
    }

    /** Modifies input to prevent having to create multiple StringBuilders. */
    private StringBuilder appendAdverbAdjectiveNoun(StringBuilder sb) {
        if (sb == null) { throw new NullPointerException("StringBuilder must not be null"); }
        boolean isFirstLetterUppercase = sb.length() == 0;
        String adverb = getAdverb();
        String article;
        if (startsWithVowel(adverb)) {
            article = isFirstLetterUppercase ? "An" : "an";
        } else {
            article = isFirstLetterUppercase ? "A" : "a";
        }
        sb.append(article).append(" ");
        sb.append(adverb).append(" ");
        sb.append(getAdjective()).append(" ");
        sb.append(getNoun());
        return sb;
    }

    /** Return a random adverb. */
    public String getAdverb() {
        return adverbs.get(mRandom.nextInt(adverbs.size()));
    }

    /** Return a random adjective. */
    public String getAdjective() {
        return adjectives.get(mRandom.nextInt(adjectives.size()));
    }

    /** Return a random noun. */
    public String getNoun() {
        return nouns.get(mRandom.nextInt(nouns.size()));
    }

    /** Return a random phrase connective. */
    public String getPhraseConnective() {
        return phraseConnectives.get(mRandom.nextInt(phraseConnectives.size()));
    }

    private boolean startsWithVowel(String string) {
        if (string == null) { throw new NullPointerException("String must not be null"); }
        if (string.isEmpty()) { throw new NullPointerException("String must not be empty"); }
        return string.charAt(0) == 'a' ||
                string.charAt(0) == 'e' ||
                string.charAt(0) == 'i' ||
                string.charAt(0) == 'o' ||
                string.charAt(0) == 'u';
    }

}
